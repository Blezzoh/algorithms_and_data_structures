package algorithms;

/**
 * Created by blaise on 6/25/17.
 * does int insertion sort in an non decreasing order.
 */
public class IntInsertionSort {
    int [] arrayToSort;

    public IntInsertionSort(int [] arrayToSort){
        this.arrayToSort = arrayToSort;
    }

    public int[] getArrayToSort() {
        return arrayToSort;
    }

    public void increasingInsertSort(){
        this.arrayToSort = applyIncreasingInsertionSort(getArrayToSort());
    }
    public void decreasingInsertSort(){
        this.arrayToSort = applyDecreasingInsertionSort(getArrayToSort());
    }
    // the insertion sort algorithm
    // exercise 2.1-1
    public int [] applyIncreasingInsertionSort(int [] arrayToSort){
        int key, i;
        for (int j = 1; j <arrayToSort.length ; j++) {
            key = arrayToSort[j];
            i = j-1;
            while (i >= 0 && arrayToSort[i] > key){
                arrayToSort[i+1] = arrayToSort[i];
                i = i - 1;
            }
            arrayToSort[i + 1] = key;
        }
        return arrayToSort;
    }
    //// the insertion sort algorithm
    // exercise 2.1-2
    public int [] applyDecreasingInsertionSort(int [] arrayToSort){
        int key, i;
        for (int j = 1; j <arrayToSort.length ; j++) {
            key = arrayToSort[j];
            i = j-1;
            while (i >= 0 && arrayToSort[i] < key){
                arrayToSort[i+1] = arrayToSort[i];
                i = i - 1;
            }
            arrayToSort[i + 1] = key;
        }
        return arrayToSort;
    }
    public void printArray(){
        for (int i = 0; i <arrayToSort.length ; i++) {
            System.out.printf("%d -> ", arrayToSort[i]);
        }
        System.out.printf("\b\b\b\n");
    }
    // does a linear search
    // return index of the value if the value is in the array and -1 otherwise
    // exercise 2.1-3
    public int linearSearch(int value){
        for (int i = 0; i < arrayToSort.length; i++) {
            if(arrayToSort[i] == value){
                return i;
            }
        }
        return -1;
    }
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
