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
public class Q6LinkedList<T> implements LinkedList<T> {
    
    private ListNode head;
    
    public Q6LinkedList(){
        head = null;
    }
    
    public void showList(){
        ListNode currentNode = head;
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
        ListNode previousNode = head;
        ListNode currentNode = head;
        
        while(currentNode.getLink() != null){
            previousNode = currentNode;
            currentNode = currentNode.getLink();
        }
        
        previousNode.setLink(null);
        
    }
    
    public int getSize(){
        int counter = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            counter += 1;
            currentNode = currentNode.getLink();
        }
        
        return counter;
    }
    
    public void addFrontNode(T data){
        head = new ListNode(data, head);
    }
    
    public void deleteFrontNode(){
        head = head.getLink();
    }
    
    public T findMiddle1(){             //Using fast/slow pointer
        ListNode slow = head;
        ListNode fast = head;
        
        if(getSize() % 2 == 0){
                while(fast != null){
                slow = slow.getLink();
                fast = fast.getLink().getLink();
            }
        }
        
        else if(getSize() % 2 == 1){
                while(fast.getLink() != null){
                slow = slow.getLink();
                fast = fast.getLink().getLink();
            }
        }
        
        return (T)slow.getData();
    }
    
    public T findMiddle2(){
        int counter = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            counter += 1;
            currentNode = currentNode.getLink();
        }
        
        int middle = 0;
        
        if(counter % 2 == 0){
            middle = (counter / 2) + 1;
        }
        else if(counter % 2 == 1){
            middle = (counter + 1) / 2;
        }
        
        counter = 1;
        
        ListNode finalNode = head;
        while(counter < middle){
            finalNode = finalNode.getLink();
            counter += 1;
        }
        
        return (T) finalNode.getData();
    }
    
    
    
}
