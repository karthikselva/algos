
package algos;

class Node {
    public int data;
    public Node next;
    
    public Node(int value) {
        data = value;     
    }

    public void printList() {
        Node tmp = this;
        while(tmp != null) {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
        System.out.println("");
    }    
    
    public int length() {
        int len = 0;
        Node tmp = this;
        while(tmp != null) {
            tmp = tmp.next;
            len += 1;
        }        
        return len;
    }
    
    public Node middle() {
        Node hare = this.next, tortoise = this;
        while(hare != null) {
            hare = hare.next;
            // Was making mistake by off by one 
            if(hare != null) {
                hare = hare.next;
                tortoise = tortoise.next;
            }
        }
        return tortoise;
    }
    
    public String stringify() {
        int len = 0;
        Node tmp = this;
        String res = "";
        while(tmp != null) {
            res += tmp.data;
            tmp = tmp.next;            
        }        
        return res;        
    }
}

public class MergeSortLinkedList {
    private Node list;
    public MergeSortLinkedList(Node head) {
        list = head;
    }
        
   public Node mergeSort(Node h) {
//       h.printList();
       if(h == null || h.next == null) return h;
       Node middle = h.middle();
       Node nextMiddle = middle.next;
       middle.next = null;
       Node left = mergeSort(h);
       Node right = mergeSort(nextMiddle);
       return sortedList(left,right);
   }
   
   public Node sortedList(Node left, Node right) {
       Node result = null;
       if(left == null) return right;
       if(right == null) return left;
       
       if(left.data < right.data) {
           result = left;
           result.next = sortedList(left.next,right);
       }
       else {
           result = right;
           result.next = sortedList(left,right.next);
       }
       return result;
   }
}
