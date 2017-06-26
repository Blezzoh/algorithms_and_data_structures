package data_structures;

/**
 * Created by Blaise on 6/5/17.
 * simple Hash Table for employees ids
 * ids must be unique
 * ids must be all between 0 and MAX_INT
 */

public class SimpleHashForEmployeesId {

    private int max_entries;
    private int[] ids;
    // used for empty spots in the hash table
    private static final int EMPTY = -1;

    public SimpleHashForEmployeesId(int max_entries) {
        this.max_entries = max_entries;
        ids = new int[max_entries];
        for (int i = 0; i < max_entries; i++) {
            ids[i] = EMPTY;
        }
    }

    public SimpleHashForEmployeesId(int max_entries, int  ... anyIds){
        this(max_entries);
        addId(anyIds);
    }
    public int getMax_entries() {
        return max_entries;
    }

    // returns 0 if addition is successful and 1 otherwise
    public int addId(int id) {
        int index = id % max_entries;
        //check EMPTY spot
        if (ids[index] == EMPTY) {
            ids[index] = id;
            return 0;
        }
        // check for the next available spot: linear probing
        while (ids[index] != EMPTY && index < max_entries) {
            index++;
            if (ids[index] == EMPTY  && index < max_entries) {
                ids[index] = id;
                return 0;
            }
        }
        // worst case
        for (int i = 0; i < (id % max_entries); i++) {
            if (ids[max_entries] == EMPTY) {
                ids[i] = id;
                return 0;
            }
        }
        return 1;
    }

    // adds multiple ids
    public void addId(int ...anyIds){
        for (int id: anyIds) {
            int val =  addId(id);
            if(val == 0){
                System.out.println( id + "has been added");
            }
            else{
                System.out.println("failed to add" + anyIds);
            }
        }
    }

    // return index if the id is found and -1 otherwise
    public int searchId (int id){
        int index = id%max_entries;
        if (ids[index] == id) {
            return index;
        }
        while( index < max_entries && ids[index] != id){
            index ++;
            if(index < max_entries && ids[index] == id )
                return index;
        }
        for (int i = 0; i < (id % max_entries); i++) {
            if(ids[i] == id){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int id){
        if(searchId(id) == -1)
            return false;

        else
            return true;

    }
    // return true if it is removed and false otherwise
    public boolean removeId(int id){
        if(searchId(id) == -1){
            return false;
        }
        else{
            int index = searchId(id);
            ids[index] = EMPTY;
            return true;
        }
    }
    public void printIds(){
        for (int i: ids) {
            System.out.println(i);
        }
    }
    public static void main(String args[]){

        SimpleHashForEmployeesId employeesId = new SimpleHashForEmployeesId(100, 12343, 34567,23434,43545);
        System.out.println(employeesId.searchId(12343));
        employeesId.addId(12356, 12325,12875, 65987, 34102);
        System.out.println(employeesId.addId(92345));
        employeesId.printIds();
        System.out.println(employeesId.removeId(12356));
        int val = employeesId.searchId(92345);
        System.out.printf("id: " + val);
    }
}