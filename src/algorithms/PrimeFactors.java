import java.io.*;
import java.util.*;
import java.lang.Math.*;

class PrimeFactors {
  static ArrayList<Integer> prime_factors(int n){
    int x =2;
    int y = (int) Math.ceil(Math.sqrt(n));
    System.out.println(n);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    while(x<= y){
      if( n % x == 0){
        arr.add(x);
        n = n / x;
      }
      else{
        if( x == 2)
          x++;
        else 
          x += 2;
      }
    }
    if(n != 1)
      arr.add(n);
    return arr;
  }
  public static void main (String[] args) {
    ArrayList<Integer> list = prime_factors(225);
    System.out.println(Arrays.toString(list.toArray()));
  }
}
