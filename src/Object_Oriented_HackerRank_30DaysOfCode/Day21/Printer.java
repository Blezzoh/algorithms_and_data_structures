package Object_Oriented_HackerRank_30DaysOfCode.Day21;

/**
 * Created by blaise on 8/22/17.
 */
public class Printer<T>  {
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param arr generic array
     **/

    // Write your code here

    public <T> void printArray(T [] arr){
        for (T el : arr){
            System.out.println(el);
        }
    }
}
