/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerTest {

    @Test
    public void testPowIter() {
        System.out.println("powIter");
        Power instance = new Power(3,3);
        int expResult = 27;
        int result = instance.powIter();
        assertEquals(expResult, result);
    }
    

    @Test
    public void testPowIRec() {
        System.out.println("powRec");
        Power instance = new Power(3,3);
        int expResult = 27;        
        int result = instance.powRec(3,3);
        assertEquals(expResult,result);
    }    
}
