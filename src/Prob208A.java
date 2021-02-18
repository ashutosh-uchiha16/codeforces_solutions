import java.util.Scanner;

public class Prob208A {
    //Dubstep
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       String str2 = str.replaceAll("WUB", " ").trim();
        System.out.println(str2);

    }
}
