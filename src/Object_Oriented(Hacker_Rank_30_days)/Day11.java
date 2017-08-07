import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int findMax(List<Integer> sums){
        int max = sums.get(0);
        for( int i =1; i<sums.size(); i++){
            if( max < sums.get(i))
                max = sums.get(i);
        }
        return max;
    }
    public static List<Integer> sumHourGlasses(int [][] arr){
        List <Integer> sums = new ArrayList<>();
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                sums.add(sum);
            }
        }
        return sums;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(findMax(sumHourGlasses(arr)));
        
        
        
    }
}
