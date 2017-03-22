/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Akanksha Avhad
 */
public class MyArrayList< T> {

    private T[] alist;
    private int size = 0;

    public MyArrayList() {
        alist = (T[]) new Object[100];
    }

    public int size() {
        return size;
    }

    public void add(T e) {

        if (size >= alist.length) {
            T[] temp = alist;
            alist = (T[]) new Object[alist.length * 2];
            for (int j = 0; j < 100; j++) {
                alist[j] = temp[j];
            }
        } 
        alist[size] = e;
        size++;
        
    }

    public T get(int a) {
        if (a < size) {
            return alist[a];
        } else {
            System.out.println("Exception");
            return null;
        }
    }

    public void remove(int a){
        
        if(a>size){
            System.out.println("Element does not exist");
        }
        else{
            for(int j=a;j<size;j++){
                alist[j]=alist[j+1];
            }
            alist[--size]=null;
        }
    }
}
