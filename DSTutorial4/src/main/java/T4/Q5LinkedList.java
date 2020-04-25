/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4;

import java.util.Random;

/**
 *
 * @author Naim
 */
public class Q5LinkedList<T> implements LinkedList<T> {
    private ListNode head;
    private int size;
    
    public void showList(){
        ListNode currentNode = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(currentNode != null){
                if(currentNode.getLink() == null){
                    System.out.println(currentNode.getData());
                    currentNode = currentNode.getLink();
                }
                else{
                    System.out.print(currentNode.getData() + " ---> ");
                    currentNode = currentNode.getLink();
                }
            }
        }
    }
    
    public void addNode(T data){
        ListNode newNode = new ListNode(data, null);
        ListNode currentNode = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
        size += 1;
    }
    
    public void deleteNode(){
        ListNode previousNode = head;
        ListNode currentNode = head;
        
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(currentNode != null){
                previousNode = currentNode;
                currentNode = currentNode.getLink();
            }
            previousNode.setLink(null);
        }
        size -= 1;
    }
    
    public void deleteFrontNode(){
        head = head.getLink();
        size -= 1;
    }
    
    public void deleteAtPosition(int index){
        if(index == 0 || head == null){
            deleteFrontNode();
        }
        else if(index == getSize()){
            deleteNode();
        }
        else{
            ListNode currentNode = head;
            for(int i = 1; i < index; i++){
                currentNode = currentNode.getLink();
            }
            ListNode temp = currentNode.getLink();
            currentNode.setLink(temp.getLink());
            temp = null;
        }
        
        size -= 1;
    }
    
    public int getSize(){
        return size;
    }
    
    public void generateRandom(int number, int range){
        Random r = new Random();
        int counter = 0;
        while(counter < number){
            Integer rand = r.nextInt(range + 1);
            addNode((T)rand);
            counter += 1;
        }
        this.size = number;
    }
    
    public boolean find(T n){
        ListNode currentNode = head;
        boolean check = false;
        if(head.getData() == n){
            check = true;
        }
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
                if(currentNode.getData() == n){
                    check = true;
                }
            }
        }
        return check;
    }
    
    public void findAndDelete(T n){
        if(head.getData() == n){
            deleteFrontNode();
        }
        else{
            int pointer = 0;
            ListNode currentNode = head;
            while(currentNode != null){
                if(currentNode.getData() == n){
                    deleteAtPosition(pointer);
                    currentNode = currentNode.getLink();    // no pointer addition because if node is removed, pointer becomes the same for next node
                }
                else{
                    pointer += 1;
                    currentNode = currentNode.getLink();
                }
            }
        }
    }
    
}
