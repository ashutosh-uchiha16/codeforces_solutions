import java.util.Scanner;

public class Prob50A {
    //Domino Piling
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        double n = sc.nextInt();
        double pro = Math.floor(m/2 * n/1);
        System.out.println((long)pro);

    }
}
