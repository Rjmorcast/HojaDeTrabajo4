/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class ListaSimpleEncadenadaTest {
    
    Lista example =  new ListaSimpleEncadenada();
    
    public ListaSimpleEncadenadaTest() {
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
     * Test of clear method, of class ListaSimpleEncadenada.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
         int expected = 0;
        example.add(1);
        example.add(3);
        example.add(4);
        example.add(5);
        example.clear();
        int result =  example.size();
        assertEquals( expected, result,0);
    }

    /**
     * Test of add method, of class ListaSimpleEncadenada.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int expected = 5;
        example.add(1);
        example.add(3);
        example.add(4);
        example.add(5);
        int result = (int) example.getLast();
        assertEquals( expected, result,0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getLast method, of class ListaSimpleEncadenada.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        int expected = 5;
        example.add(1);
        example.add(3);
        example.add(4);
        example.add(5);
        int result = (int) example.getLast();
        assertEquals( expected, result,0);
    }

    /**
     * Test of removeLast method, of class ListaSimpleEncadenada.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        int expected = 4;
        example.add(1);
        example.add(3);
        example.add(4);
        example.add(5);
        example.removeLast();
        int result = (int) example.getLast();
        assertEquals( expected, result,0);
    }

    /**
     * Test of size method, of class ListaSimpleEncadenada.
     */
    @Test
    public void testSize() {
        System.out.println("size");
         int expected = 4;
        example.add(1);
        example.add(3);
        example.add(4);
        example.add(5);
        int result = example.size();
        assertEquals( expected, result,0);
    }

    
    
}
