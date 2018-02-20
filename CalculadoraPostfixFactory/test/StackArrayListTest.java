/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Rodrigo
 */
public class StackArrayListTest {
    
    Stack stack = new StackArrayList<>();
    
    public StackArrayListTest() {
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(8);
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
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int expected = 10;
        stack.push(10);
        int result = (int) stack.pop();
         assertEquals(expected,result);
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
         int expected = 10;
        stack.push(10);
        int result = (int) stack.pop();
         assertEquals(expected,result);
    }

    /**
     * Test of peek method, of class StackArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
         int expected = 8;
        
        int result = (int) stack.peek();
         assertEquals(expected,result);
    }

    /**
     * Test of empty method, of class StackArrayList.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        boolean result = stack.empty();
        
        assertEquals(false,result);
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        int result = stack.size();
        
        assertEquals(5,result);
    }
    
}
