package model;

import exceptions.InvalidKeyException;
import exceptions.InvalidValueException;
import exceptions.KeyNotFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProdDictionaryTest {

    ProdDictionary prodDictionary;

    @Before
    public void setUp() {
        prodDictionary = new ProdDictionary(10);
    }

    @Test
    public void testSetterValid() throws Exception {
        int key1 = 1;
        String value1 = "Sony TV";
        prodDictionary.set(key1,value1);
        Assert.assertEquals(value1,prodDictionary.get(key1));
    }

    @Test(expected = InvalidKeyException.class)
    public void testSetterInvalidKey() throws Exception {
        int key1 = 0;
        String value1 = "Sony TV";
        prodDictionary.set(key1,value1);
        Assert.assertEquals(value1,prodDictionary.get(key1));
    }

    @Test(expected = InvalidValueException.class)
    public void testSetterInvalidValue() throws Exception {
        int key1 = 1;
        String value1 = "";
        prodDictionary.set(key1,value1);
        Assert.assertEquals(value1,prodDictionary.get(key1));
    }

    @Test
    public void testGetter() throws Exception {
        int key2 = 2;
        String value2 = "Apple iphone";
        prodDictionary.set(key2,value2);
        Assert.assertEquals(value2,prodDictionary.get(key2));
    }

    @Test(expected = KeyNotFoundException.class)
    public void testGetterInvalid() throws Exception {
        int key1 = 1;
        int key2 = 2;
        String value2 = "Apple iphone";
        prodDictionary.set(key2,value2);
        Assert.assertEquals(key1,prodDictionary.get(key1));
    }

    @Test
    public void testUpdateValueInSetter() throws Exception {
        int key1 = 1;
        String value1 = "Sony TV";
        String value1_rename = "Sony TV Bravia";
        prodDictionary.set(key1,value1);
        Assert.assertEquals(value1,prodDictionary.get(key1));
        prodDictionary.set(key1,value1_rename);
        Assert.assertEquals(value1_rename,prodDictionary.get(key1));
    }


}
