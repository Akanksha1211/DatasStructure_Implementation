/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author aavha
 * MyLinkedList<Integer> linkedList=new MyLinkedList<Integer>();
 */
public class MyLinkedList<T> {
    
     
     private Node head;
     
     
    MyLinkedList(){
        this.head=null;
    }
    
    public void add(T e){
        
      Node n=new Node();
       if(head==null){
         head=n;
         n.setData(e);   
       }
       else{
           n.setNext(head);
           head=n;
           n.setData(e);
       }
      }
    
    public void remove(){
        //Node n=new Node();
        if(head==null){
            System.out.println("Empty list");
        }
        else{
            head=head.getNext();
            //head=null;
        }
    }
    
    public void removeData(T e){
        Node n=head;
        if(head==null){
            System.out.println("Empty list");
        }else if(n.getData().equals(e)){
          head=head.getNext();  
        }
        else{
            while(n.getNext()!=null){
                if(n.getNext().getData().equals(e)){
                    Node p= n.getNext().getNext();
                    n.setNext(p);
                    break;
                }
                n=n.getNext();
            }
        }
        
    }
    
    public Node reverse(Node head){
        Node currentNode=head;
        Node previous=null;
        
        while(currentNode!=null){
           Node temp=currentNode.getNext();
           currentNode.setNext(previous);
           previous=currentNode;
           currentNode=temp;
        }
        return previous;
    }
    
    public Node getHead(){
        return head;
    }
    public void printList(Node head){
        Node n=head;
        while(n!=null){
         System.out.print(" "+n.getData()+"  ");   
         n=n.getNext();
        }  
        
    }
}
