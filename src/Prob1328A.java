import java.util.Scanner;

public class Prob1328A {
    //Divisibility Problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a < b)
                System.out.println(b - a);
            else{
                if(a % b == 0)
                    System.out.println(0);
                else{
                    int div = a / b;
                    System.out.println( (div + 1) * b - a);
                }

            }
        }
    }
}
