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

/**
 *
 * @author Karthik
 */
public class NodeTest {
    @Test
    public void testMiddle() {
        Node h = new Node(5);
        h.next = new Node(4);
        h.next.next = new Node(6);
        h.next.next.next = new Node(1);
        h.next.next.next.next = new Node(3); 
        h.next.next.next.next.next = null;
        h.printList();
        Node middle = h.middle();
        assertEquals(middle.data,6);
    }
    
}
