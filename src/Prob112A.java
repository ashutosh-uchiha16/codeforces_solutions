import java.util.Scanner;

public class Prob112A {
    //Petya and Strings
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.equals(str2))
            System.out.println(0);
        else if(str1.compareTo(str2) > 0)
            System.out.println(1);
        else if(str1.compareTo(str2) < 0)
            System.out.println(-1);
    }
}
