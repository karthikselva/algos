package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSortTest {
    
    public MergeSortTest() {
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

    @Test
    public void testPrintArrayEven() {
        System.out.println("printArray");
        int [] arr = new int[]{4,3,1,6,9,2,11,5};
        int [] expected = new int[]{1,2,3,4,5,6,9,11};
        MergeSort instance = new MergeSort(arr);
        instance.printArray();
        Assert.assertArrayEquals(expected,arr);
    }
    
    @Test
    public void testPrintArrayOdd() {
        System.out.println("printArray");
        int [] arr = new int[]{4,3,1,6,9,2,5};
        int [] expected = new int[]{1,2,3,4,5,6,9};
        MergeSort instance = new MergeSort(arr);
        instance.printArray();
        Assert.assertArrayEquals(expected,arr);
    }    
}
