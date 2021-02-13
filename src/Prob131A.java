import java.util.Scanner;

public class Prob131A {
    //cAPS LOCK
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        boolean isCaps = true;
        for(int i =1; i < chars.length; i++)
            if(Character.isLowerCase(chars[i]))
                isCaps = false;

        if(isCaps){
            for(int i = 0; i < chars.length; i++){
                if(Character.isUpperCase(chars[i]))
                    chars[i] = Character.toLowerCase(chars[i]);
                else
                    chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        for(int i = 0; i < chars.length; i++)
            System.out.print(chars[i]);
    }
}
