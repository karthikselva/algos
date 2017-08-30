package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnionFindTest {

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
