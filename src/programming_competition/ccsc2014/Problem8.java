package programming_competition.ccsc2014;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by blaise on 9/21/17.
 */
public class Problem8 {
    static String capitalize(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1, str.length()).toLowerCase();
    }
    static String parseDate(int day, int d, String m, int y ){
        HashMap<Integer, String> days = new HashMap<>();
        days.put(0, "Saturday");
        days.put(1, "Sunday");
        days.put(3, "Tuesday");
        days.put(4, "Wednesday");
        days.put(5, "Thursday");
        days.put(6, "Friday");
        days.put(2, "Monday");


        return days.get(day)+ ", " + capitalize(m)+ " " + d+ ", "+ y ;
    }
    static int day(int j, int k, int m, int q){
        return   (q+ ((26 * (m+1) )/10)+ k+ (k/4) +(j/4) +(5 *j)) % 7;
    }
    static int parseDay(String d){

        return Integer.parseInt(d.substring(0, d.length()-1));
    }
    public static void main(String [] args){

        HashMap<String, Integer> months = new HashMap<String, Integer>(12);
        months.put("january", 13);
        months.put("february", 14);
        months.put("march", 3);
        months.put("april", 4);
        months.put("may",5);
        months.put("june",6);
        months.put("july",7);
        months.put("august",8);
        months.put("september", 9);
        months.put("october", 10);
        months.put("november", 11);
        months.put("december", 12);

        Scanner sc = new Scanner("5\n" +
                "November 8, 2014\n" +
                "October 31, 2013\n" +
                "OCTOBER   24,   2014\n" +
                "January 1, 2000\n" +
                "september 11, 2001");
        int n = sc.nextInt();
        while(n>0){
            String month = sc.next().toLowerCase();
            int m = months.get(month);
            int d = parseDay(sc.next());
            int y = sc.nextInt();
            if(m ==13 || m == 14) y--;
            int j = y/100;
            int k = y % 100;
            int day = day(j,k, m,d);
            if(m ==13 || m == 14) y++;
            System.out.println(parseDate(day, d, month, y));
            n--;
        }
    }
}
