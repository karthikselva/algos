package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeapTest {
    
    @Test
    public void testHeap() {
        System.out.println("add");
        int arr[] = {5,6,3,1,7,2,4};
        int res[] = new int[7];
        int exp[] = {1,2,3,4,5,6,7};
        Heap instance = new Heap();
        for(int i:arr){
            instance.add(-i);            
        }
        for(int i=0;i<arr.length;i++){
            res[i] = -instance.remove();
            System.out.println(res[i]);
        }
        Assert.assertArrayEquals(exp, res);
    }
    
}
