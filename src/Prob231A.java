import java.util.Scanner;

public class Prob231A {
    //Team
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, count = 0;
        int[] a = new int[3];
        while(num-- > 0){
            for(int i = 0; i < 3; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if(sum >= 2)
                count++;
            sum = 0;
        }
        System.out.println(count);
    }
}
