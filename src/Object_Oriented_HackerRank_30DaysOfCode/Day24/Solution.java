import java.io.*;
import java.util.*;

class Solution{
 public static Node removeDuplicates(Node head) {
        // Your code here
        // node "start" will be the node to match against
        Node start = head;
        
        // "toCompare" node is the node to compare the node "start" with
        Node toCompare = head.next;
        
        // node previous to the "toCompare" node
        Node previous = head;
        
        while(start != null){
          while(toCompare != null){
              // removing the duplicate
              if(toCompare.data == start.data){
                  previous.next = toCompare.next;
                  toCompare = previous.next;
              }
              // in case of no match
              else{
                  previous = previous.next;
                  toCompare = toCompare.next;
              }
          }
          start = start.next;
          previous = start;
          if(start != null){
              toCompare = start.next;
          }
              
        }
        return head;
    }
    	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }
