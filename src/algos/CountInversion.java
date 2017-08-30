package algos;

public class CountInversion {
    private int [] array;
    public CountInversion(int data[]) {
        array = data;
    }
        
    public int countInversions() {
        int inversions = mergeSort(0,array.length-1);
        return inversions;
    }
    
    private int mergeSort(int lo, int hi) {
        if(lo == hi || hi > (array.length-1) || lo > (array.length-1)) return 0;
        int mid = (lo+hi)/2;
        int inversions = mergeSort(lo,mid);
        inversions += mergeSort(mid+1,hi);
        inversions += count(lo,mid,hi);
        return inversions;
    }
    
    private int count(int lo, int mid, int hi) {
        int n1 = mid - lo + 1, n2 = hi - mid;
        int i, j, k, inversion = 0; 
        int [] larr = new int[n1], rarr = new int[n2];
        for(i=0;i<n1;i++)
            larr[i] = array[lo + i]; 
        for(i=0;i<n2;i++)
            rarr[i] = array[mid + i + 1];         
        i = 0;
        j = 0;
        k = lo;        
        while(i<n1 && j <n2) {
            if(larr[i] > rarr[j]) {
                inversion = inversion + (mid - i - lo +  1);
                array[k] = rarr[j];
                j += 1;
            }
            else {
                array[k] = larr[i];            
                i += 1;
            }
            k += 1;
        }
        while(i < n1) {
            array[k] = larr[i];
            k += 1;
            i += 1;
        }
        while(j < n2) {
            array[k] = rarr[j];
            j += 1;
            k += 1;
        }
       return inversion;
    }
    public void printArray(int [] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
    
    public void printArray() {
        printArray(array);
    }
}
