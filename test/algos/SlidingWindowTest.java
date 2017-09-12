package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SlidingWindowTest {

    
    @Test
    public void testMaxWindow() {
        System.out.println("maxWindow");
        int k = 3;
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int[] expected = {10,9,8,7,6,5,4,3};
        SlidingWindow instance = new SlidingWindow(arr);
        int [] actual = instance.maxWindow(k);
        Assert.assertArrayEquals(expected,actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
