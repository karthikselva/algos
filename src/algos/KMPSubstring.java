package algos;

import java.util.List;

public class KMPSubstring {
    
    private String target;
    private String pattern;
    private int[] reset;
    
    public KMPSubstring(String t){
        target = t;
    }
    
    public int substr(String p){
        pattern = p;
        preProcess();        
        return _substr();
    }
    
    private void preProcess(){
        reset = new int[pattern.length()];        
        int i = 0, j = -1, m = pattern.length()-1;
        reset[0] = j;
        while(i < m) {
            while( j >= 0 && (pattern.charAt(i) != pattern.charAt(j))) {
                j = reset[j];
            }
            i += 1;
            j += 1;
            reset[i] = j;
        }        
        for(int el: reset)
            System.out.print(el+" ");
        System.out.println();
    }   
    
    private int _substr() {
        int i = 0, j = 0, n = target.length(), m = pattern.length();
        while(i < n){
            while( j >= 0 && (target.charAt(i) != pattern.charAt(j))) {
                j = reset[j];
            }
            i += 1;
            j += 1;
            if(j == m) {
                return (i-j);
            }
        }
        return -1;
    }
}
