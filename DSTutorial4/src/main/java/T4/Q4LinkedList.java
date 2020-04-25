/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4;

/**
 *
 * @author Naim
 */
public class Q4LinkedList<T> implements LinkedList<T> {
    private ListNode head;
    private int size;
    
    public Q4LinkedList(){
        head = null;
    }
    
    public void addNode(T data){
        ListNode newNode = new ListNode(data, null);
        if(head == null){
            head = newNode;
        }
        else{
            ListNode currentNode = head;
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
        while(currentNode != null){
            previousNode = currentNode;
            currentNode = currentNode.getLink();
        }
        previousNode.setLink(null);
    }
    
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
    
    public Integer calculateSum(){
        Integer sum = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            sum += (Integer)currentNode.getData();
            currentNode = currentNode.getLink();
        }
        return sum;
    }
    
    public int countEven(){
        int counter = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            if((Integer)currentNode.getData() % 2 == 0){
                counter += 1;
            }
            currentNode = currentNode.getLink();
        }
        return counter;
    }
    
    public int getSize(){
        return size;
    }
}
