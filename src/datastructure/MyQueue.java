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
public class MyQueue {
    
    public MyArrayList a;
    
    MyQueue(){
        a= new MyArrayList();
    }
    
    public void push(Object e){   
       a.add(e);
    }
    
    public Object poll(){
      // int size=a.size(); 
       Object v= a.get(0);
       a.remove(0);
       return v;
        
    }
    
    public Object peek(){       
       Object v= a.get(0);
       return v;
    }
    
}
