package data_structures;

/**
 * Created by blaise on 6/7/17.
 * basic client to test some functions for the hash tables
 */
public class SimpleHashForEmployeesIdClient {

    public static void main(String args[]){

        SimpleHashForEmployeesId employeesId = new SimpleHashForEmployeesId(100, 12343, 34567,23434,43545);
        System.out.println(employeesId.searchId(12343));
        employeesId.addId(12356, 12325,12875, 65987, 34102);
        System.out.println(employeesId.addId(92345));
        employeesId.printIds();
        System.out.println(employeesId.removeId(12356));
        int val = employeesId.searchId(12356);
        System.out.printf("id: " + val);
    }
}
