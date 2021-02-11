import java.util.Scanner;

public class Prob59A {
    //Word
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        int lowercaseL = 0, uppercaseL = 0;
        for(char ch : chars){
            if(ch >= 'a' && ch <= 'z')
                lowercaseL++;
            if(ch >='A' && ch <='Z')
                uppercaseL++;
        }
        if(lowercaseL >= uppercaseL)
            str = str.toLowerCase();
        else
            str = str.toUpperCase();
        System.out.println(str);
    }
}
