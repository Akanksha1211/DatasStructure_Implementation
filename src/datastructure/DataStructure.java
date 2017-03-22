/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

;

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

        
        MyLinkedList<Object> l =new MyLinkedList<>();
       
        l.add(33333);
        l.add(12222);
        l.add("sdfd");
        l.add(33333);
        l.removeData("sdfd");
        l.add(33333);
        l.removeData(33333);
        l.printList();
        
        MyQueue q=new MyQueue();
        q.push(1);
        q.push(2);
        q.poll();
        q.peek();
         
        
        MyStack s=new MyStack();
        s.push(1);
        s.push("Akanksha");
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

       }

}
