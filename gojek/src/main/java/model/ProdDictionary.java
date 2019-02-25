package model;

import exceptions.InvalidKeyException;
import exceptions.InvalidValueException;

import java.util.Hashtable;

public class ProdDictionary {
    Hashtable<Integer,String> hashtable;

    public ProdDictionary(){
        hashtable = new Hashtable<Integer, String>();
    }

    public void set(int key,String value) throws InvalidKeyException, InvalidValueException {
        if(key <= 0) {
            throw new InvalidKeyException("Key cannot be 0 or less than that");
        }else if(value==null || value.equals("")) {
            throw new InvalidValueException("Value cannot be null or empty");
        }
        hashtable.put(key, value);
    }

    public String get(int key) {
        return hashtable.get(key);
    }
}
