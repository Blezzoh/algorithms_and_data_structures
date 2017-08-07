package algorithms;

/**
 * Created by blaise on 6/30/17.
 * exercises on string using the string builder class
 * Read that they are mutable in opposition to regular string that are immutable
 */
public class StringsWithStringBuilderProblems {
    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     */
    public static String helloName(String name){
        return new StringBuilder("Hello ").append(name).append("!").toString();
    }
    /*

    Given two strings, a and b, return the result of putting them together
     in the order abba,
      e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
    public static String makeAbba(String a, String b) {
        return new StringBuilder(a).append(b).append(b).append(a).toString();
    }
    /*

    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
     In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
      Given tag and word strings, create the HTML string with tags
      around the word, e.g. "<i>Yay</i>".
     */
    public static String makeTags(String tag, String word) {
        return new StringBuilder(makeATag(tag, true)).append(word).append(makeATag(tag, false)).toString();
    }

    public static String makeATag(String tag, boolean opening){
        if(opening)
            return "<"+ tag + ">";
        else
            return "</"+ tag + ">";
    }

    /*

    Given an "out" string length 4, such as "<<>>", and a word, return a new string
    where the word is in the middle of the out string, e.g. "<<word>>".
     */
    public static String makeOutWord(String out, String word) {
        return new StringBuilder(out.substring(0,2)).append(word).append(out.substring(2,4)).toString();
    }

    /*
     *reverse a string
     * not fast just for practise
     */
    public static String reversed(String word){
        char [] chars = word.toCharArray();
        return reverse(chars, chars.length);
    }
    public static String reverse(char [] chars, int length){
        StringBuilder str = new StringBuilder(length);
        for (int i = length-1; i >=0 ; i--) {
            str.append(chars[i]);
        }
        return str.toString();
    }

    /*
    checks if the word is a palindrome
     */
    public static boolean palindrome(String word){
        String wordReversed = new StringBuilder(word).reverse().toString();
        return word.equals(wordReversed);
    }
    public static void main (String [] args){
        // helloName
        System.out.println("helloName(\"Bob\") : " + helloName("Bob") );
        System.out.println("helloName(\"Alice\"): " + helloName("Alice"));
        System.out.println("helloName(\"X\"): " + helloName("X"));
        System.out.println("helloName(\"Goodbye\"): " + helloName("Goodbye"));
        System.out.println("\n");

        //makeAbba
        System.out.println("makeAbba(\"Hi\", \"Bye\"): " +makeAbba("Hi", "Bye"));
        System.out.println("makeAbba(\"Yo\", \"Alice\"): " +makeAbba("Yo", "Alice"));
        System.out.println("makeAbba(\"What\", \"Up\"): " +makeAbba("What", "Up"));
        System.out.println("\n");

        //make tags
        System.out.println("makeTags(\"i\", \"Yay\"): " + makeTags("i", "Yay"));
        System.out.println("makeTags(\"i\", \"Hello\"): " + makeTags("i", "Hello"));
        System.out.println("makeTags(\"body\", \"Heart\") : " + makeTags("body", "Heart") );
        System.out.println("\n");

        // makeOutWord
        System.out.println("makeOutWord(\"<<>>\", \"Yay\"): " + makeOutWord("<<>>", "Yay"));
        System.out.println("makeOutWord(\"[[]]\", \"word\") : " + makeOutWord("[[]]", "word") );
        System.out.println("makeOutWord(\"HHoo\", \"Hello\": " + makeOutWord("HHoo", "Hello"));
        System.out.println("\n");

        //reverse a string
        System.out.println("reversed(ander): " + reversed("ander"));
        System.out.println("reversed(Sewanee): " + reversed("Sewanee"));
        System.out.println("reversed(eva, can I see bees in a cave): " + reversed("eva, can I see bees in a cave"));
        System.out.println("\n");

        //palindrome
        System.out.println("palindrome(racecar): " + palindrome("racecar"));
        System.out.println("palindrome(madam): " + palindrome("madam"));
        System.out.println("palindrome(eva, can I see bees in a cave): " + palindrome("eva, can I see bees in a cave"));
        System.out.println("palindrome(boolean): " + palindrome("boolean"));

    }
}
