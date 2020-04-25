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
public class Q3LinkedList<T> implements LinkedList<T>{
    private ListNode head;
    
    public Q3LinkedList(){
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
    }
    
    public void deleteNode(){
        ListNode currentNode = head;
        ListNode previousNode = head;
        
        while(currentNode.getLink() != null){
            previousNode = currentNode;
            currentNode = currentNode.getLink();
        }
        
        previousNode.setLink(null);
    }
    
    public void showList(){
        ListNode currentNode = head;
        if(head == null){
            System.out.println("The list is empty");
        }
        else{
            while(currentNode != null){
                if(currentNode.getLink() == null){
                    System.out.print(currentNode.getData());
                    currentNode = currentNode.getLink();
                }
                else{
                    System.out.print(currentNode.getData() + " ---> ");
                    currentNode = currentNode.getLink();
                }
            }
            System.out.println("");
        }
    }
    
}
