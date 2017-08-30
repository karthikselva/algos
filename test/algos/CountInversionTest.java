package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountInversionTest {
    
    @Test
    public void testCountInversionsZero() {
        System.out.println("countInversions");
        CountInversion instance = new CountInversion(new int[]{1,2,3,4,5,6});
        int expResult = 0;
        int result = instance.countInversions();
        assertEquals(expResult, result);
    }

    @Test
    public void testCountInversionsFull() {
        System.out.println("countInversions");
        CountInversion instance = new CountInversion(new int[]{6,5,4,3,2,1});
        int expResult = 15;
        int result = instance.countInversions();
        assertEquals(expResult, result);
    }

    @Test
    public void testCountInversionsPartial() {
        System.out.println("countInversions");
        CountInversion instance = new CountInversion(new int[]{1, 20, 6, 4, 5});
        int expResult = 5;
        int result = instance.countInversions();
        assertEquals(expResult, result);
    }  

    @Test
    public void testCountInversionsEvenNumbers() {
        System.out.println("countInversions");
        CountInversion instance = new CountInversion(new int[]{1, 20, 6, 4, 5, 21});
        int expResult = 5;
        int result = instance.countInversions();
        assertEquals(expResult, result);
    }        
}
