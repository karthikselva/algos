package algos;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeFromInPreTest {
    
    @Test
    public void testConvert() {
        System.out.println("convert");
        int [] in = {4,2,5,1,6,7,3,8};
        int [] pre = {1,2,4,5,3,7,6,8};
        TreeFromInPre instance = new TreeFromInPre(pre,in);
        instance.convert();
        int [] actualIn = instance.inorder();
        Assert.assertArrayEquals(in, actualIn);
    }
}
