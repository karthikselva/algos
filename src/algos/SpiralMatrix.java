package algos;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    private int[][] matrix;
    public SpiralMatrix(int[][] mat) {
        matrix = mat;
    }
    
    public List<Integer> spiral() {
        int r1 = 0,c1= 0,r2 = matrix.length-1, c2 = matrix[0].length-1;
        List<Integer> result = new ArrayList<>();
        
        int c,r;
        while(r1 <= r2 && c1 <= c2) {
            for(c=c1;c<c2;c++){
                result.add(matrix[r1][c]);
            }
            for(r=r1;r<r2;r++){
                result.add(matrix[r][c2]);
            }
            if(r1 < r2 && c1 < c2){
                for(c=c2;c>c1;c--) {
                    result.add(matrix[r2][c]);
                }
                for(r=r2;r>r1;r--){
                    result.add(matrix[r][c1]);
                }
            }
            r1 += 1;
            r2 -= 1;
            c1 += 1;
            c2 -= 1;
        }
        return result;
    }
}
