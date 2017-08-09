package Object_Oriented_HackerRank_30DaysOfCode;

import java.io.*;
import java.util.*;

public class Day10 {
    
    public static String toBinary(int n){
        StringBuilder base2= new StringBuilder();
        while(n>1){
            int rem = n%2;
            base2.append(rem);            
            n /= 2;
        }
        base2.append(1);
        base2.reverse();
        return base2.toString();
    }
    
    // finding the maximum element of a map
    public static int findMax(Map<Integer, Integer> map){
        int max = 0;
        for( Integer i : map.values()){
            if((int) i > max)
                max = i;
        }
        return max;
    }

    // return the expected question output
    public static int maxConsecutiveOnes(String bin){
        char prev = '0';
        int key = 0, value = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // algorithm for recording occurences
        for(int i =0; i<bin.length(); i++){
            if(bin.charAt(i) != '1'){
                key ++;
                value =0;
                prev = '0';
            }
            else if(bin.charAt(i) == '1' && prev != '1'){
                value = 1;
                prev = '1';
                map.put(key, value);
            }
            else if(bin.charAt(i) == '1' && prev == '1'){
                value ++;
                if(map.containsKey(key)){
                    map.replace(key, value);
                }
                else
                    map.put(key, value);
            }
        }
        
        return findMax(map);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Day18. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(maxConsecutiveOnes(toBinary(num)));
    }
}
