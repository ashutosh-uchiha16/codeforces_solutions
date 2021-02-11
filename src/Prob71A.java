import java.util.Scanner;
//Way Too Long Words
public class Prob71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numOfWords = sc.nextInt();
        sc.nextLine();
        String longWord = null;
        while(numOfWords > 0){
            longWord = sc.nextLine();
            if(longWord.length() > 10){
                System.out.print(longWord.charAt(0));
                System.out.print((longWord.length() - 2) );
                System.out.println(longWord.charAt(longWord.length()-1));
            } else
                System.out.println(longWord);
            numOfWords--;
        }
    }
}
