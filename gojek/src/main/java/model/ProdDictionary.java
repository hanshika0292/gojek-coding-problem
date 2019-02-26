package model;

public class ProdDictionary {

    private LinkedListNode[] values;
    private int capacity;

    public ProdDictionary(int capacity){
        this.capacity = capacity;
        values = new LinkedListNode[this.capacity];
    }

    public boolean set(int key,String value){
        int hashValueOfKey = getHashValue(key);
        LinkedListNode valueLL = values[hashValueOfKey];
        while (valueLL != null){
            if(valueLL.key==key){
                valueLL.value = value;
                return true;
            }
            valueLL = valueLL.next;
        }
        valueLL = new LinkedListNode(key,value);
        return true;
    }

    private int getHashValue(int key) {
        return key%this.capacity;
    }

    public String get(int key) {
        int hashValueOfKey = getHashValue(key);
        LinkedListNode valueLL = values[hashValueOfKey];
        while (valueLL!=null){
            if(valueLL.key==key){
                return valueLL.value;
            }
        }
        return null;
    }

    private class LinkedListNode{
        int key;
        String value;
        LinkedListNode next;
        LinkedListNode(int key,String value){
            this.key = key;
            this.value = value;
        }
    }
}



// 1 aa - (1/10)=0
// 11 bb - (11/10)=1
// 101 cc - (101/10)=10
