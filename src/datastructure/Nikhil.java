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
public class Nikhil {
    private String friends;
    private int salary;
    
    public Nikhil(int sal){
        friends = "Sachin and Akki";
        salary = sal;
    }
    public void addFriends(String f){
       friends = friends +" "+f; 
    }
    public String getFriends(){
        return friends;
    }
    
    public int getSalary(){
        return salary;
    }
    
    
}
