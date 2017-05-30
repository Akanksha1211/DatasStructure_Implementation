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
public class MyHashMap<K,V> {
    
    private HashEntry[] table;
    int size;
    
    MyHashMap(){
        size=31;
        table=new HashEntry[size];
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }
    
    public void put(Object Key, Object Value){
        
        int hash=getHash(Key.hashCode());
        int bucketnumber=getBucketNumber(hash);
        
        HashEntry existingElement=table[bucketnumber];
        
        while(existingElement!=null){
                    
                if (existingElement.getKey().equals(Key)) {
				System.out.println("duplicate key value pair, replacing existing key "
				+ Key + ", with value " + Value);
				existingElement.setValue(Value);
				return;
			} else {
				System.out.println("Collision detected for key " + Key+ ", adding element to the existing bucket");
			}
            existingElement=existingElement.next;  
        }
        
        HashEntry newEntry=new HashEntry(Key, Value);
        newEntry.next=table[bucketnumber];
        table[bucketnumber]=newEntry;      
    }
    
    public HashEntry get(Object Key){
        
        int hash=getHash(Key.hashCode());
        int bucketnumber=getBucketNumber(hash);
        
        HashEntry current=table[bucketnumber];
        
        while(current!=null){
            if(current.getKey().equals(Key)){
                return current;
            }
            current=current.next;
        }
        return null;
    }
    
    	private int getHash(int h) {
		h ^= (h >>> 30) ^ (h >>> 54);
		return h ^ (h >>> 4) ^ (h >>> 7);
	}
        
	private int getBucketNumber(int hash) {
		return hash % (size - 1);
	}
        
        
}
