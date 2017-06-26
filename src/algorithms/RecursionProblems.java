package algorithms;


/**
 * Created by blaise on 6/26/17.
 * Exercise about recursion and answers
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
    public static int sumDigits(int n) {
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

    /*
    Given a non-negative int n, return the count of the occurrences
    of 7 as a digit, so for example 717 yields 2. (no loops).
     */
    public static int count7(int n) {
        if(n<10){
            if(n == 7)
                return 1;
            else
                return 0;
        }
        else{
            int farRight = n%10;
            n /= 10;
            if ( farRight == 7){
                return 1 + count7(n);
            }
            else return 0 + count7(n);
        }
    }
    /*

    Given a string, compute recursively (no loops)
    the number of lowercase 'x' chars in the string.
    */
    public static int countX(String str) {
        int n = str.length() - 1;
        return countX(str, n);
    }

    public static int countX(String str, int n){
        if(n == -1)
            return 0;
        else if(n == 0){
            if(str.charAt(0) == 'x')
                return 1;
            else
                return 0;
        }
        else{
            if(str.charAt(n) == 'x')
                return 1 + countX(str, n-1);
            else
                return 0 + countX(str, n-1);
        }
    }

    /*
    Given a string, compute recursively (no loops) the number of times lowercase "hi"
    appears in the string.
     */
    public static int countHi(String str) {
        int n = str.length() - 1;
        return countHi(str, n);
    }


    public static int countHi(String str,int n){
        if(n-1 < 0){
            return 0;
        }
        else if(n == 1){

            if(str.substring(0, 2).equals("hi"))
                return 1;

            else
                return 0;
        }
        else{

            if(str.substring(n-1, n+1).equals("hi"))
                return 1 + countHi(str, n-1);

            else
                return countHi(str, n-1);
        }
    }

    /*
    Given a string, compute recursively (no loops) a new string where
    all the lowercase 'x' chars have been changed to 'y' chars.
     */
    public static String changeXY(String str) {
        char c [] = str.toCharArray();
        return changeXY(c, c.length-1);
    }

    public static String changeXY(char [] c ,int n){
        if(n < 0){
            return "";
        }

        if (n == 0){

            if(c [0] == 'x') c[0] = (char) 'y';
            return String.valueOf(c);


        }
        else{
            if(c [n] == 'x') c[n] = (char) 'y';
            return changeXY( c , n-1);

        }
    }

    public static void main(String [] args){
        RecursionProblems recur = new RecursionProblems();
        // bunny ears problems
        System.out.println("bunnyEars(0): " + bunnyEars(0));
        System.out.println("bunnyEars(1): " + bunnyEars(1));
        System.out.println("bunnyEars(2): " + bunnyEars(2));
        System.out.println("bunnyEars(3): " + bunnyEars(3));
        System.out.println("bunnyEars(10): " + bunnyEars(10));
        System.out.println("bunnyEars(-5): " + bunnyEars(-5) + "\n");

        //sumDigits
        System.out.println("sumDigits(0): " + sumDigits(0));
        System.out.println("sumDigits(5): " + sumDigits(5));
        System.out.println("sumDigits(115): " + sumDigits(115));
        System.out.println("sumDigits(123456789): " + sumDigits(123456789)+ "\n");

        //count occourrence of 7
        System.out.println("count(0): " + count7(0));
        System.out.println("count(127): " + count7(127));
        System.out.println("count(7): " + count7(7));
        System.out.println("count(1274357778): " + count7(1274357778));
        System.out.println("count(1123456890): " + count7(1123456890)+ "\n");

        //count occurrence of x
        System.out.println("countX(\"xxhixx\"): " + countX("xxhixx") );
        System.out.println("countX(\"hi\"): " + countX("hi") );
        System.out.println("countX(\"h\"): " + countX("h") );
        System.out.println("countX(\"x\"): " + countX("x") );
        System.out.println("countX(\"\"): " + countX("")+ "\n");

        //count occurrence of hi
        System.out.println("countHi(\"xxhixx\"): " + countHi("xxhixx") );
        System.out.println("countHi(\"\"): " + countHi(""));
        System.out.println("countHi(\"ihihihihih\") : " + countHi("ihihihihih") );
        System.out.println("countHi(\"hiAAhi12hi\"): " +countHi("hiAAhi12hi") );
        System.out.println("countHi(\"xhixhxihihhhih\"): " + countHi("xhixhxihihhhih"));
        System.out.println("countHi(\"ship\"): " + countHi("ship")+ "\n");

        // change x to y
        System.out.println("changeXY(\"codey\"): " + changeXY("codey"));
        System.out.println("changeXY(\"\") : " + changeXY("")  );
        System.out.println("changeXY(\"xxx\") : " + changeXY("xxx") );
        System.out.println("changeXY(\"yyhxyi\"): " + changeXY("yyhxyi"));
        System.out.println("changeXY(\"hihi\"): " + changeXY("hihi"));
        System.out.println("changeXY(\"xhixhix\"): " + changeXY("xhixhix")+ "\n");

    }


}
