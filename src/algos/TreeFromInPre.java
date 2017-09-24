package algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Tree {
    public int data;
    public Tree left;
    public Tree right;
    public Tree(int d){
        data = d;
    }
}
public class TreeFromInPre {
    private final int[] pre;
    private final int[] in;
    private Tree treeStart;
    private Map<Integer,Integer> inorderIndices;
    private static int ind;
    public TreeFromInPre(int[] p, int[] i) {
        pre = p;
        in = i;
    }
    
    public Tree convert(){
        formInorderMap();
        return (treeStart = _convert(0,pre.length-1,0,in.length-1));
    }
    
    public int[] inorder() {
        int [] trav = new int[in.length];
        ind = 0;
        _inorder(treeStart,trav);
        return trav;
    }
    
    private void _inorder(Tree root,int[] list) {
        if(root == null) 
            return;
        _inorder(root.left,list);
        list[ind++] = root.data;
        System.out.println(ind+" => "+root.data);
        _inorder(root.right,list);
    }
    
    private void formInorderMap() {
        inorderIndices = new HashMap<>(); 
       for(int i=0;i<in.length;i++){
            inorderIndices.put(in[i], i);
        }
    }
    
    private Tree _convert(int preStart, int preEnd, int inStart, int inEnd){
        if(inStart > inEnd) {
            return null;
        }
        Tree root = new Tree(pre[preStart]);
        if(inStart == inEnd) 
            return root; 
        
        int inorderIndex = inorderIndices.get(root.data);
        int leftCount = inorderIndex - inStart;
        root.left = _convert(preStart+1, preStart+leftCount, inStart, inorderIndex-1);
        root.right = _convert(preStart+leftCount+1, preEnd, inorderIndex+1,inEnd);
        return root;
    }
}
