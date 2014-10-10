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
public class TreeMapSetTest {
    public Word word;
    public Word barrera, andrea;
    public TreeMapSetTest() {
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
     * Test of add method, of class TreeMapSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word("andrea","barrera");
        TreeMapSet instance = new TreeMapSet();
        instance.add(wordObject);
    }
    /**
     * Test of get method, of class TreeMapSet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word wordObject = new Word("andrea","barrera");
        TreeMapSet instance = new TreeMapSet();
        instance.add(wordObject);
        Word expResult = barrera;
        Word result = instance.get(andrea);
        assertEquals(expResult, result);
     
    }
}