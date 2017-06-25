package algorithms;

/**
 * Created by blaise on 6/25/17.
 * does int insertion sort
 */
public class IntInsertionSort {
    int [] arrayToSort;

    public IntInsertionSort(int [] arrayToSort){
        this.arrayToSort = arrayToSort;
    }

    public int[] getArrayToSort() {
        return arrayToSort;
    }

    public void insertSort(){
        this.arrayToSort = applyInsertionSort(getArrayToSort());
    }
    // the insertion sort algorithm
    public int [] applyInsertionSort(int [] arrayToSort){
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
    public void printArray(){
        for (int i = 0; i <arrayToSort.length ; i++) {
            System.out.printf("%d ->", arrayToSort[i]);
        }
        System.out.printf("\b\b\n");
    }

}
