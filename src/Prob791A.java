import java.util.Scanner;

public class Prob791A {
    //Bear and Big Brother
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limakWeight = sc.nextInt();
        int bobWeight = sc.nextInt();
        int count = 0;
        while(limakWeight <= bobWeight){
            limakWeight *= 3;
            bobWeight *= 2;
            count++;
        }
        System.out.println(count);
    }
}
