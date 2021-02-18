import java.util.Scanner;

public class Prob61A {
    //Ultra-Fast Mathematician
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        char[] ans = new char[chars1.length];
        for(int i = 0; i < chars1.length; i++){
            if(chars1[i] == chars2[i])
                ans[i] = '0';
            else
                ans[i] = '1';

        }
        for(char ch: ans)
            System.out.print(ch);

    }
}
