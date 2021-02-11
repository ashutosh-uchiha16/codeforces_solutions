import java.util.Scanner;

public class Prob41A {
    //Translation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int i = 0, j = str1.length()-1;
        boolean isSame = true;
        if(str1.length() != str2.length()){
            isSame = false;
        } else{
            while(i < str1.length()){
                if(chars1[i] != chars2[j]){
                    isSame = false;
                    break;
                }
                i++;
                j--;
            }
        }

        if(isSame)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
