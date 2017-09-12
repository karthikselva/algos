package algos;
public class Power {
    private int x,y;
    public Power(int a,int b) {
        x = a;
        y = b;
    }
    
    int powIter() {
        int xTmp = x, yTmp = y, res = 1;
        while(yTmp>0){
            if(yTmp%2 == 1)
                res *= xTmp;
            xTmp = xTmp*xTmp;
            yTmp = yTmp/2;
        }
        return res;
    }
    
    int powRec(int xTmp, int yTmp) {
        if(yTmp == 0) return xTmp;
        if(yTmp%2==1) return xTmp*powRec(xTmp,yTmp/2);
        return powRec(xTmp,yTmp/2);                    
    }
}
