package algos;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] arr = new int[] {4,2,5,7,21,43,67,10,1};
        int[] expected = new int[] {1,2,4,5,7,10,21,43,67};
        QuickSort instance = new QuickSort(arr);
        int[] result = instance.sort();
        assertArrayEquals(expected, result);
    }
    
}
