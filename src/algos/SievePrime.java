package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SievePrime {
    private final boolean[] bs;
    private final int sieveSize;
    private final List<Integer> primes;
    public SievePrime(int size){  
        sieveSize = size;
        bs = new boolean[sieveSize];
        Arrays.fill(bs,true);
        bs[0] = false;
        bs[1] = false;
        primes = new ArrayList<>();
        preCalculate();
    }
    
    private void preCalculate() {
        for(int i = 2; i < sieveSize; i++) {
            if(bs[i]){
                for(int j = 2*i; j < sieveSize; j+=i) {
                    bs[j] = false;
                }
                primes.add(i);
            }
        }
    }
    
    public boolean isPrime(int num){
        if(num < sieveSize) {
            return bs[num];
        }
        else {
            for(int i=0; primes.size() > i; i++){
                if((num%primes.get(i)) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
