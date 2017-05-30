/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.HashMap;

/**
 *
 * @author aavha
 */


public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Tree t = new Tree();
        t.insert(70);
        t.insert(60);
        t.insert(50);

        t.insert(40);
        t.insert(55);
        t.insert(65);
        t.insert(41);
        t.insert(42);
        t.insert(44);
        t.insert(30);

        t.delete(70);
        t.inorderPrint();
        System.out.println((t.root.getData()));

        
        MyLinkedList l =new MyLinkedList();
       
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        //l.removeData(33333);
        l.printList(l.getHead());
       
       
        Node newHead= l.reverse(l.getHead());
        l.printList(newHead);
        
        MyQueue q=new MyQueue();
        q.push(1);
        q.push(2);
        q.poll();
        q.peek();
   
        MyStack s=new MyStack();
        HashMap<MyStack,MyStack> ds=new HashMap<>();
        
        ds.put(s, s);
        
        s.push(1);
        s.push(2);
        
        ds.put(s,s);
        
        System.out.println("dfgvr "+s.hashCode());
        s.push(5);
        s.push(7);
        s.push("Akanksha");
        
        ds.put(s,s);
        
        for(MyStack s1: ds.keySet()){
          //  System.out.println("Keys "+s1);
        }
        
        //System.out.println("Value "+ds.get(s));
        
        //System.out.println("dfgvr "+s.hashCode());
        System.out.print(q.peek());
        System.out.print(s.pop());
        System.out.print(s.pop());
        System.out.print(s.pop());
        MyArrayList<Nikhil> al = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(new Nikhil(i));
        }

        System.out.println("Size Before"+al.size());
        al.remove(5);
        System.out.println("Size Before"+al.size());
        
         MyHashMap<Integer,Integer> myHash=new MyHashMap<Integer,Integer>();
         myHash.put(1, 1);
         myHash.put(2, 2);
         myHash.put(1, 1);
         
         HashEntry value=myHash.get(1);
         System.out.println("Value " +value.getValue());
       }
    
      
      
}
