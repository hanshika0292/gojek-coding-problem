package model;

import java.util.Hashtable;

public class ProdDictionary {
    Hashtable<Integer,String> hashtable;

    public ProdDictionary(){
        hashtable = new Hashtable<Integer, String>();
    }

    public void set(int key,String value) {
        hashtable.put(key, value);
    }

    public String get(int key) {
        return hashtable.get(key);
    }
}
