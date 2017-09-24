package algos;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> data;
    private int size;
    public Heap(){
        data = new ArrayList<Integer>();
        data.add(null);
        size = 1;
    }
    public void add(int val) {
        size += 1;
        data.add(val);
        bubbleUp(size-1);
    }
    
    public int remove(){
        size -= 1;        
        int res = data.get(1);
        data.set(1,data.get(size));
        bubbleDown(1);
        return res;
    }
        
    private void bubbleDown(int i){
        int curr = data.get(i);
        int leftIndex = 2*i, rightIndex = 2*i + 1;
        
        int maxIndex = -1;
        if(rightIndex < size && leftIndex < size && (data.get(leftIndex) > data.get(rightIndex))) {
            maxIndex = leftIndex;
        }
        else if(rightIndex < size) {
            maxIndex = rightIndex;
        }
        else if(leftIndex < size){
            maxIndex = leftIndex;
        }
        if(maxIndex == -1 || (data.get(maxIndex) < curr)){
            return;
        }
        swap(maxIndex,i);
        
        bubbleDown(maxIndex);        
    }
    
    private void bubbleUp(int i){
        if(i==1)
            return;
        int curr = data.get(i);
        int parent = data.get(i/2);
        if(curr > parent) {
            swap(i,i/2);
            bubbleUp(i/2);
        }
    }
    
    private void swap(int i, int j){
        int tmp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, tmp);
    }
}
