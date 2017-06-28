package algorithms;

/**
 * Created by Blaise on 6/27/17.
 * Not original at all but somehow necessary
 */
public class RandomRange {
    // return an integer between min and max
    public static int randomInRange(int min , int max){
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    // return an integer from 0 to the number-1
    public static int randomToNumber(int number){
        return (int) Math.floor(Math.random() * number);
    }

    public static void main(String [] args){
        for (int i = 0; i < 20; i++) {
            System.out.println("range from 7 to 10: "+ randomInRange(7,10));
            System.out.println("range from 11 to 100000: "+randomInRange(11, 100000));
            System.out.println("0 to 11: "+randomToNumber(12));
            System.out.println("0 to 12345"+ randomToNumber(12345));
            int num = i + 1;
            System.out.println("end of loop " + num + "\n");
        }

    }
}
