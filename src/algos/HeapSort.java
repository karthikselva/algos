package algos;
public class HeapSort {
    private int [] array;
    public HeapSort(int [] arr) {
        array = arr;
    }
    
    public int [] sort() {
        int n = array.length, tmp;
        for(int i=n/2-1; i >= 0; i--){
            heapify(n,i);
        }
        
        for(int i = (n-1); i >= 0; i--) {
            tmp = array[0];
            array[i] = array[0];
            array[0] = tmp;
            heapify(i,0);
        }
        return array;
    }
    
    
    private void heapify(int n, int i) {
        int largest = i, tmp;
        int l = 2*i + 1, r = 2*i + 2;
        if(l < n && array[l] > array[largest])
            largest = l;
        if(r < n && array[r] > array[largest])
            largest = r; 
        
        if(largest != i) {
            tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;
            heapify(n,largest);
        }
    }
    
}
