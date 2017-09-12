package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedianOfArraysTest {
    
    @Test
    public void testMedian() {
        System.out.println("median");
        MedianOfArrays instance = new MedianOfArrays(new int[]{1,3,5,7}, new int[]{2,4,6,8});
        int expResult = 4;
        int result = instance.medianN();
        assertEquals(expResult, result);
    }
    
}
