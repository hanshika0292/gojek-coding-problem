package model;

import exceptions.InvalidKeyException;
import exceptions.InvalidValueException;
import exceptions.KeyNotFoundException;

import java.util.Hashtable;

public class ProdDictionary {
    private Hashtable<Integer,String> dictionary;

    public ProdDictionary(){
        dictionary = new Hashtable<Integer, String>();
    }

    public void set(int key,String value) throws InvalidKeyException, InvalidValueException {
        if(key <= 0) {
            throw new InvalidKeyException("Key cannot be 0 or less than that");
        }else if(value==null || value.equals("")) {
            throw new InvalidValueException("Value cannot be null or empty");
        }
        dictionary.put(key, value);
    }

    public String get(int key) throws KeyNotFoundException {
        if(!dictionary.contains(key)) {
            throw new KeyNotFoundException("Key not present in dictionary");
        }
        return dictionary.get(key);
    }
}
