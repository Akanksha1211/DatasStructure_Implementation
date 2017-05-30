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
public class HashEntry {

    private Object key;
    private Object value;
    HashEntry next=null;
    
    HashEntry(Object k, Object v){
        key=k;
        value=v;
    }
    
    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
  
    		@Override
		public int hashCode() {
			// this ensures all hashcodes are between 0 and 15
			return key.hashCode() % 10;
		}

		@Override
		public boolean equals(Object obj) {
			HashEntry other = (HashEntry) obj;
			return this.getKey().equals(other.getKey());
		}

		@Override
		public String toString() {
			return this.getKey() + "-" + this.getValue();
		}
                
}
