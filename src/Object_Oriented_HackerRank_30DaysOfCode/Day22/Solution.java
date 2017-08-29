package Object_Oriented_HackerRank_30DaysOfCode.Day22;

import java.util.Scanner;

/**
 * Created by blaise on 8/29/17.
 */
class Solution {
    // return the height of the tree
     private static int getHeight(Node root){
        Node left = root.left;
        Node right = root.right;
        if(left == null && right == null){
            return 0;
        }
        else if(left == null){
            return 1 + getHeight(right);
        }
        else if(right == null){
            return 1 + getHeight(left);
        }
        return 1 + Math.max(getHeight(left), getHeight(right));
    }

    private static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }


}
