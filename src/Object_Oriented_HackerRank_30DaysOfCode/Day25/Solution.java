package Object_Oriented_HackerRank_30DaysOfCode.Day25;

/**
 * Created by blaise on 8/30/17.
 */
import java.util.*;

public class Solution {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        if(n%2 == 0 || n == 1){
            return false;
        }
        for(int i = 3; i< Math.ceil(n/2.0); i +=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            if(isPrime(sc.nextInt())){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
            n --;
        }
    }
}
