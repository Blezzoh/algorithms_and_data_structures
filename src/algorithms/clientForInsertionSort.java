package algorithms;

/**
 * Created by blaise on 6/25/17.
 * client for IntInsertionSort.
 */
public class clientForInsertionSort {
    public static void main(String [] args){
        int [] arrayToSort = {31, 41, 59, 26, 41, 58};
        IntInsertionSort theArray = new IntInsertionSort(arrayToSort);
        theArray.printArray();
        theArray.increasingInsertSort();
        theArray.printArray();
        theArray.decreasingInsertSort();
        theArray.printArray();
        int val = theArray.linearSearch(41);
        System.out.println("41 is at index: " + val);
        val = theArray.linearSearch(42);
        // should be -1 as 42 is not in the array
        System.out.println("42 is at index: " + val);
    }
}
