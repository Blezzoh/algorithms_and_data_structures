package algorithms;

/**
 * Created by blaise on 6/25/17.
 * client for ItnInsertionSort.
 */
public class clientForInsertionSort {
    public static void main(String [] args){
        int [] arrayToSort = {100, 90, 120, 80, 0};
        IntInsertionSort theArray = new IntInsertionSort(arrayToSort);
        theArray.printArray();
        theArray.insertSort();
        theArray.printArray();
    }
}
