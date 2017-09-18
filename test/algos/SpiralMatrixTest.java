package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpiralMatrixTest {
    
    @Test
    public void testSpiral() {
        System.out.println("spiral");
        int[][] mat = 
        {
            {1,2,3,4,5,6,7},
            {8,9,10,11,12,13,14},
            {15,16,17,18,19,20,21},
            {22,23,24,25,26,27,28},
            {29,30,31,32,33,34,35},
            {36,37,38,39,40,41,42}
        };
        SpiralMatrix instance = new SpiralMatrix(mat);
        List<Integer> expResult = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,14,21,28,35,42,41,40,39,38,37,36,29,22,15,8,9,10,11,12,13,20,27,34,33,32,31,30,23,16,17,18,19,26,25,24));
        List<Integer> result = instance.spiral();
        assertEquals(expResult, result);
    }
    
}
