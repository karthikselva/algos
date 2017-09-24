package algos;

public class SquareRoot {
    private double num;
    public SquareRoot(double n){
        num = n;
    }
    
    public double baylonianSqrt(){
        double x = num;
        double y = 1;
        double e = 0.0001;
        while( x-y > e) {
            x = (x+y)/2;
            y = num/x;
        }
        return x;
    }
}
