package Object_Oriented_HackerRank_30DaysOfCode.Day23;
/**
 * Created by blaise on 8/29/17.
 */



public class Solution {
    static void levelOrder(Node root){
        //Write your code here
        int levels = 1 + getHeight(root);
        for(int i=1; i<=levels; i++){
            printLevel(root, i);
        }
    }
    static void printLevel(Node root, int level){
        if(root == null){
            return;
        }
        else if(level == 1){
            System.out.print("" + root.data + " ");
        }
        else{
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }
    }

    static int getHeight( Node root){
        Node left = root.left;
        Node right = root.right;
        if(left ==null && right ==null ){
            return 0;
        }
        else if (left == null){
            return 1 + getHeight(right);
        }
        else if(right == null){
            return 1+getHeight(left);
        }
        return 1+ Math.max(getHeight(left), getHeight(right));
    }
}
