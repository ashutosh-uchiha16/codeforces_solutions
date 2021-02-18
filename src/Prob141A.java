import java.util.Arrays;
import java.util.Scanner;

public class Prob141A {
    //Amusing Joke
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    String strFinal = sc.next();
    String str = str1 + str2;
    char[] str12 = str.toCharArray();
    char[] strF = strFinal.toCharArray();
        Arrays.sort(str12);
         Arrays.sort(strF);
        String strFirst = String.valueOf(str12);
        String strSecond = String.valueOf(strF);

        if(strFirst.equals(strSecond))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
