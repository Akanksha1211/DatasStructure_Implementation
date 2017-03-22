/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author aavha
 */
public class MyStack{
    
    public MyArrayList a;
    
    MyStack(){
        a= new MyArrayList();
    }
    
    public void push(Object e){   
       a.add(e);
    }
    
    public Object pop(){
       int size=a.size(); 
       Object v= a.get(--size);
       a.remove(size);
       return v;
        
    }
    
    public Object peek(){
       int size=a.size(); 
       Object v= a.get(--size);
       return v;
    }
}
