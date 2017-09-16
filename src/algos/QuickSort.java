package algos;
public class QuickSort {
    private int [] array;
    public QuickSort(int [] arr) {
        array = arr;
    }
    
    public int[] sort() {
        _sort(0,array.length-1);
        return array;
    }
    
    private void _sort(int low,int hi) {
        if( low < hi ) {
            int pi = partition(low,hi);
            _sort(low,pi-1);
            _sort(pi+1,hi);
        }
    }    
    
    private void swap(int i,int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;        
    }
    
    private int partition(int low, int hi) {
        int i = (low - 1);
        int pivot = array[hi];
        for(int j=low; j <= (hi-1); j++) {
            if(array[j] <= pivot) {
                i++;
                swap(i,j);
            }
        }
        i++;
        swap(i,hi);
        return i;
    }
}
