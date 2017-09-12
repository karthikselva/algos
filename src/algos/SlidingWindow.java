package algos;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    private int [] array;
    public SlidingWindow(int [] arr) {
        array = arr;
    }
    
    public int [] maxWindow(int k) {
        int[] result = new int[array.length-k+1];
        Deque<Integer> Qi = new LinkedList<Integer>();
        int n = array.length, i = 0;
        while(i < k) {
            while(!Qi.isEmpty() && array[i] >= array[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
            i += 1;
        }
        
        while(i < n) {
            System.out.println(" Max in range: "+(i-k)+" to "+i+" is "+array[Qi.peek()]);
            result[i-k]=array[Qi.peek()];
            while(!Qi.isEmpty() && Qi.peek() <= (i-k))
                Qi.removeFirst();
            while(!Qi.isEmpty() && array[i] >= array[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
            i += 1;
        }
        System.out.println(" Max in range: "+(i-k)+" to "+i+" is "+array[Qi.peek()]);
        result[i-k] = array[Qi.peek()];        
        return result;
    }
}
