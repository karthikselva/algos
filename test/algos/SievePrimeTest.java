package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SievePrimeTest {
    
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        SievePrime instance = new SievePrime(1000000);
        boolean result = instance.isPrime(7);
        assertEquals(true, result);        
        result = instance.isPrime(8);
        assertEquals(false, result);    
        result = instance.isPrime(1000000007);
        assertEquals(true, result);    
        result = instance.isPrime(1);
        assertEquals(false, result);            
    }
    
}
