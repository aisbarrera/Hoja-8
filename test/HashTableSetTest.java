/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreabarrera
 */
public class HashTableSetTest {
    
    public HashTableSetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get method, of class HashTableSet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word andrea = new Word();
        Word barrera = new Word();
        Word word = new Word("andrea","barrera");
        HashTableSet instance = new HashTableSet();
        instance.add(word);
        Word expResult = barrera;
        Word result = instance.get(andrea);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class HashTableSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word andrea = new Word();
        Word wordObject = new Word("andrea","barrera");
        HashTableSet instance = new HashTableSet();
        instance.add(wordObject);
        System.out.println(instance.get(andrea));
    }
}