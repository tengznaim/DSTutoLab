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
public class Q1LinkedList<T> implements LinkedList<T>{
    private ListNode head;
    
    public Q1LinkedList(){
        head = null;
    }
    
    public void showList(){
        ListNode currentNode = head;
        if(head != null){
            System.out.println("The numbers in the linked list: ");
            while(currentNode != null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
            System.out.println("");
        }
        else if(head == null){
            System.out.println("This list is empty");
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
    
    public void addNodeByPosition(T data, int position){
        ListNode currentNode = head;
        ListNode previousNode = head;
        for(int i = 0; i < position; i++){
            previousNode = currentNode;
            currentNode = currentNode.getLink();
        }
        
    }
    
    public void modifyNodes(){
        ListNode currentNode = head;
        if(currentNode.getData() instanceof Double){
            while(currentNode != null){
                double temp = (Double)currentNode.getData() + 10.5;
                currentNode.setData(temp); 
                currentNode = currentNode.getLink();
            }
        }
        else{
            System.out.println("The list is not made of doubles");
        }
    }
    
}
