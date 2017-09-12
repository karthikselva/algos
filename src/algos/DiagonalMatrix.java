package algos;
public class DiagonalMatrix {
    private int [][] matrix;
    public DiagonalMatrix(int [][] mat) {
        matrix = mat;
    }
    public void printDiagonal() {
        System.out.println(diagonal());
    }
    public String diagonal() {
        String result = "";
        for(int i=0;i<matrix.length;i++){
            int x = i, y = 0;    
            while(x >= 0) {
                result += matrix[x][y]+" ";
                x -= 1;
                y += 1;
            }
            result +="\n";
        }      

        for(int j=1;j<matrix.length;j++){
            int x = matrix.length-1, y = j;    
            while(y < matrix.length) {
                result += matrix[x][y]+" ";
                x -= 1;
                y += 1;
            }
            result +="\n";
        }      
        
        return result;
    }
}
