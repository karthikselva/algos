package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeapSortTest {
    
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] arr = new int[] {5,3,4,2,1,6,9,0};
        HeapSort instance = new HeapSort(arr);
        int[] expResult = new int[]{0,1,2,3,4,5,6,9};
        int[] result = instance.sort();
        assertArrayEquals(expResult, result);
    }
    
}
