import java.util.Scanner;

public class Prob118A {
    //String Task
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowels = new char[]{'a', 'o', 'y', 'e', 'u', 'i'};
        String str = sc.nextLine();
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean isConsonant = true;

            for(int j = 0; j < vowels.length; j++){
                if(ch == vowels[j])
                    isConsonant = false;
            }
            if(isConsonant){
                System.out.print('.');
                System.out.print(ch);
            }
        }

    }
}
