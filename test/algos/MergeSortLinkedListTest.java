package algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortLinkedListTest {
    
    public MergeSortLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Node h = new Node(5);
        h.next = new Node(4);
        h.next.next = new Node(6);
        h.next.next.next = new Node(1);
        h.next.next.next.next = new Node(3); 
        h.next.next.next.next.next = null;
        h.printList();
        Node middle = h.middle();
        assertEquals(middle.data,6);
        MergeSortLinkedList instance = new MergeSortLinkedList(h);
        String expResult = "13456";
        Node head = instance.mergeSort(h);
        String result = head.stringify();
        assertEquals(expResult, result);
        head.printList();
    }

}
