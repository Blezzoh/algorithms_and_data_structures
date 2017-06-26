package algorithms;

/**
 * Created by blaise on 6/26/17.
 */
public class RecursionProblems {


    /*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because
they each have a raised foot. Recursively return the number of "ears" in the bunny
line 1, 2, ... n (without loops or multiplication).\
     */
    // return -1 if the input is negative
    public static int bunnyEars(int bunnies){
        if (bunnies <0){
            System.out.println("accepts only positive inputs");
            return -1;
        }
        if(bunnies == 0)
            return 0;

        else if(bunnies % 2 == 0)
            return 3 + bunnyEars( bunnies - 1);

        else
            return 2 + bunnyEars( bunnies - 1);
    }

    /*

Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */
    public int sumDigits(int n) {
        if (n <0){
            System.out.println("accepts only positive inputs");
            return -1;
        }
        if(n < 10){
            return n;
        }
        else{
            int farRightDigit = n % 10;
            n = n / 10;
            return farRightDigit + sumDigits(n);
        }
    }
    public static void main(String [] args){
        RecursionProblems recur = new RecursionProblems();
        // bunny ears problems
        System.out.println("bunnyEars(0): " + recur.bunnyEars(0));
        System.out.println("bunnyEars(1): " + recur.bunnyEars(1));
        System.out.println("bunnyEars(2): " + recur.bunnyEars(2));
        System.out.println("bunnyEars(3): " + recur.bunnyEars(3));
        System.out.println("bunnyEars(10): " + recur.bunnyEars(10));
        System.out.println("bunnyEars(-5): " + recur.bunnyEars(-5));
        //
        System.out.println("sumDigits(0): " + recur.sumDigits(0));
        System.out.println("sumDigits(5): " + recur.sumDigits(5));
        System.out.println("sumDigits(115): " + recur.sumDigits(115));
        System.out.println("sumDigits(123456789): " + recur.sumDigits(123456789));




    }


}
