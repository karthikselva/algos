package algos;
public class UnionFind {
    int [] elements, rank;
    
    public UnionFind(int size){
        elements = new int[size];
        rank = new int[size];
        for(int i = 0; i < size; i++) {
            elements[i] = i;
            rank[i] = 0;
        }
    }
    
    public int findSet(int i) {
        if(elements[i] == i) {
            return i;
        }
        else {
            return (elements[i] = findSet(elements[i]));
        }
    }
    
    public boolean isSameSet(int i,int j){
        return findSet(i) == findSet(j);
    }
    
    public void unionSet(int i,int j){
        if(!isSameSet(i,j)){
            if(rank[i] > rank[j]){
                elements[j] = i;
            }
            else {
                elements[i] = j;
                if(rank[i] == rank[j]) {
                    rank[j] += 1;
                }
            }
        }
    }
    
}
