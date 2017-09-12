package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiagonalMatrixTest {    

    @Test
    public void testDiagonal() {
        System.out.println("diagonal");
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        DiagonalMatrix instance = new DiagonalMatrix(mat);
        String expResult = "1 \n" +
"5 2 \n" +
"9 6 3 \n" +
"13 10 7 4 \n" +
"14 11 8 \n" +
"15 12 \n" +
"16 \n";
        String result = instance.diagonal();
        instance.printDiagonal();
        assertEquals(expResult, result);
    }
    
}
