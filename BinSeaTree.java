import java.util.*;
public class BinSeaTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key) {// searching in BST
        if(root == null){// BST Algorithm same as binary search
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else if(root.data ==key){
            return true;
        }
        else{
            return search(root.right,key);
        }
    }
    public static Node delete(Node root,int val) {// delete in Node in BST
        if(root.data > val){
            root.left=delete(root.left,val);
        }
        else if(root.data < val){
            root.right=delete(root.right,val);
        }
        else{
            //case1
            if(root.left==null && root.right==null){//case1
                return null;
            }
            //case2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case3
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root) {
        while(root.left != null){
            root=root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int X,int y){// use to print b/w
        if(root == null){                                  // two values 6 to
            return;                                        // 10 its give o/p
        }                                                  // as 7,8,9.
        if(root.data>=X && root.data<=y){
            printInRange(root.left, X, y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, y);
        }
        else if(root.data>=y){
            printInRange(root.left, X, y);
        }
        else{
            printInRange(root.right, X, y);
        }
    }
    public static void printPath(ArrayList<Integer>path) {
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void  printRoot2Leaf(Node root,ArrayList<Integer>path) {
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        else{
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String args[]) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 1)){
            System.out.println("Found");
        }
        else{
            System.out.println("not Found");
        }
        delete(root, 4);
        inorder(root);
        System.out.println();
        printInRange(root, 4, 10);
        System.out.println();
        printRoot2Leaf(root,new ArrayList<>());
    }
}
