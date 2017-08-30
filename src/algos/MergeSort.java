package algos;
public class MergeSort {
    private int [] array;
    public MergeSort(int data[]){
        array = data;
        mergeSort(0,array.length-1);
    }
    
    private void mergeSort(int lo, int hi) {
        if(lo == hi || hi > (array.length-1) || lo > (array.length-1)) return;
        int mid = (lo + hi)/2;
        mergeSort(lo,mid);
        mergeSort(mid+1,hi);
        sortedMerge(lo,mid,hi);
    }
    
    private void sortedMerge(int lo, int mid, int hi) {
        int i,j,k;
        int n1 = mid - lo + 1, n2 = hi - mid;
        
        int larr[] = new int[n1];
        int rarr[] = new int[n2];
        
        for(i=0;i<n1;i++)
            larr[i] = array[lo+i];
        for(i=0;i<n2;i++)
            rarr[i] = array[mid+i+1];
            
        i = 0;
        j = 0;
        k = lo;
        
        while(i<n1 && j<n2) {
            if(larr[i] <= rarr[j]) {
                array[k] = larr[i];
                i += 1;                
            }
            else {
                array[k] = rarr[j];
                j += 1;
            }                
            k += 1;
        }
        
        while(i < n1) {
            array[k] = larr[i];
            i += 1;
            k += 1;
        }
        
        while(j < n2) {
            array[k] = rarr[j];
            j += 1;
            k += 1;
        }
    }    
    
    
    public void printArray() {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
