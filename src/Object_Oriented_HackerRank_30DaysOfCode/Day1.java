package Object_Oriented_HackerRank_30DaysOfCode;

import java.util.Scanner;
public class Day1 {
	public static void main(String[] args) {
        /* Declare second integer, double, and String variables. */
            int a;
            double b;
            String c;
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);

        /* Read and save an integer, double, and String to your variables.*/
            a = scan.nextInt();
            b = scan.nextDouble();
            scan.nextLine();
            c = scan.nextLine();
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
            System.out.println(a+i);

        /* Print the sum of the double variables on a new line. */
            System.out.println(b + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
            System.out.println(s + c);

    }
}
