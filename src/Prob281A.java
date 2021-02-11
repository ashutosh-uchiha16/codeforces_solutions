import java.util.Scanner;

public class Prob281A {
    //Word Capitalization
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        System.out.println(String.valueOf(chars));
    }
}
