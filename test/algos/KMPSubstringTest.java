package algos;

import org.junit.Test;
import static org.junit.Assert.*;

public class KMPSubstringTest {
    
    @Test
    public void testSubstr() {
        System.out.println("substr");
        String p = "SEVENTY SEVEN ";
        String t = "TWO THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN ";
        KMPSubstring instance = new KMPSubstring(t);
        int expResult = 31;
        int result = instance.substr(p);
        assertEquals(expResult, result);
        assertEquals(4,instance.substr("THO"));
        assertEquals(13,instance.substr("SEVEN"));
    }
    
}
