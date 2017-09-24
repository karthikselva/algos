package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SquareRootTest {
    
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        SquareRoot instance = new SquareRoot(2.0);
        double expResult = 1.4142156862745097;
        double result = instance.baylonianSqrt();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testPerfectSqrt() {
        System.out.println("sqrt");
        SquareRoot instance = new SquareRoot(64.0);
        double expResult = 8.0;
        double result = instance.baylonianSqrt();
        assertEquals(expResult, result, 0.001);
    }    
}
