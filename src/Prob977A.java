import java.util.Scanner;

public class Prob977A {
    //Wrong Subtraction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int kTimes = sc.nextInt();
        while (kTimes-- > 0){
            int lastDigit = num % 10;
            if(lastDigit == 0)
                num = num/10;
            else
                num -= 1;
        }
        System.out.println(num);
    }
}
