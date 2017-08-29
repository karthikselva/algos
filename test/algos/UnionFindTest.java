/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karthik
 */
public class UnionFindTest {
    
    public UnionFindTest() {
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
     * Test of findSet method, of class UnionFind.
     */
    @Test
    public void testFindSet() {
        System.out.println("findSet");
        int i = 0;
        UnionFind instance = new UnionFind(5);
        instance.unionSet(0, 1);
        instance.unionSet(3, 4);
        int expResult = 1;
        int result = instance.findSet(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSameSet method, of class UnionFind.
     */
    @Test
    public void testIsSameSet() {
        System.out.println("isSameSet");
        int i = 0;
        int j = 0;
        UnionFind instance = new UnionFind(5);
        instance.unionSet(0, 1);
        instance.unionSet(3, 4);        
        boolean expResult = false;
        boolean result = instance.isSameSet(0, 2);
        assertEquals(expResult, result);
    }

    /**
     * Test of unionSet method, of class UnionFind.
     */
    @Test
    public void testUnionSet() {
        System.out.println("unionSet");
        int i = 0;
        int j = 1;
        UnionFind instance = new UnionFind(5);
        instance.unionSet(i, j);
        assertEquals(instance.isSameSet(0,1),true);
    }
    
}
