package programming_competition.ccsc2014;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by blaise on 9/21/17.
 */
public class Problem4 {

    public static String decrypt(String s,HashMap<Character, Character> decoder){
        StringBuilder value = new StringBuilder();
        char [] problem = s.toCharArray();
        for (int i = 0; i <problem.length ; i++) {
            value.append(decoder.get(problem[i]));
        }
        return value.toString();
    }
    public static void main(String [] args)  {
        String quert= "qwertyuiopasdfghjklzxcvbnm ";
        char [] charQuert = quert.toCharArray();
        String map = "wertyuiop[sdfghjkl;xcvbnm, ";
        char [] charMap = map.toCharArray();
        HashMap<Character, Character > encoder = new HashMap<Character, Character>(27);
        HashMap<Character, Character > decoder = new HashMap<Character, Character>(27);
        for (int i = 0; i < charMap.length; i++) {
            encoder.put(charQuert[i], charMap[i]);
            decoder.put(charMap[i], charQuert[i]);
        }
         //reading input
        Scanner sc= new Scanner("3\n" +
                "E hello world\n" +
                "D jr;;p ept;f\n" +
                "E asd");
        int n = sc.nextInt();
        while(n>0){
            String whatToDo = sc.next();
            String word = sc.nextLine();
            if(whatToDo.equals("E")){
                System.out.println(decrypt(word, encoder));
            }
            else{
                System.out.println(decrypt(word, decoder));
            }
            n--;
        }
    }
}
