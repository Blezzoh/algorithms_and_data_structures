import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int [] returnDate = new int[3];
        int [] expectedDate = new int[3];
        int fine = 0;
        boolean yearPast, monthPast, dayPast;
        
        for(int i=0; i<3; i++){
          returnDate[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++){
          expectedDate[i]= sc.nextInt();
        }
     
        if(expectedDate[2] < returnDate[2]){
            fine = 10000;
        }
        else if(expectedDate[2] == returnDate[2]){
            if(expectedDate[1] < returnDate[1]){
                fine = (returnDate[1] - expectedDate[1]) * 500;
            }
            else if(expectedDate[1] == returnDate[1]){
                if(expectedDate[0] < returnDate[0]){
                    fine = (returnDate[0] - expectedDate[0]) * 15;
                }
            }
        }
       
        
        System.out.println(fine);
    }
}
