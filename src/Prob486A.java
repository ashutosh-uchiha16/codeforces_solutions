import java.util.Scanner;

public class Prob486A {
    //Calculating Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;
        if(num % 2 == 0)
            sum = num/2;
        else
            sum = (-1)*(num/2 + 1);
        System.out.println(sum);
    }
}
