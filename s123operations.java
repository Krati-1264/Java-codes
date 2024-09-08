import java.util.Objects;
import java.util.Scanner;
public class s123operations {
    // ............................. Most of the useful Java String functions.................................
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = s.nextLine();
        System.out.println(sentence.length());
        System.out.println(sentence.contains("s"));
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.indexOf("c"));
        System.out.println(sentence.charAt(5));
        System.out.println(sentence.trim());
        System.out.println(sentence.substring(3, 10));
        System.out.println(sentence.substring(6));
        System.out.println(sentence.lastIndexOf("i"));
        System.out.println(sentence.startsWith("t"));
        System.out.println(sentence.endsWith("."));
        System.out.println(sentence.contains("s"));
        System.out.println(sentence.equals("this is a sentence"));
        System.out.println(sentence.equalsIgnoreCase("this is a sentence"));
        System.out.println(sentence.replace("s", "ss"));
        // to split a string into individual words and then maybe count thrm
        // or use the information in any desired way, by converting into a string array
        String[] words = sentence.split("\\s");
        for (String word : words) {
            System.out.println(word);
        }
    }
}