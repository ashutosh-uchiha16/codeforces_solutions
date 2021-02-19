import java.util.Scanner;

public class Prob996A {
    //Hit the Lottery
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while(t > 0){
            if(t >= 100) {
                t -= 100;
                count++;
            }
            else if(t < 100 && t >= 20){
                t -= 20;
                count++;
            }
            else if (t < 20 && t >= 10){
                t -= 10;
                count++;
            }
            else if (t < 10 && t >= 5){
                t -= 5;
                count++;
            } else {
                t -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
