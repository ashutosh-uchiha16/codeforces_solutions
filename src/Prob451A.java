import java.util.Scanner;

public class Prob451A {
    //Game with Sticks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int intersections = m * n;
        int samM = m, sanN = n;
        int count = 0;
        while(intersections > 0){
            int usedUp = samM + sanN - 1;
            samM--;
            sanN--;
            intersections -= usedUp;
            count++;
        }
        if(count % 2 == 0)
            System.out.println("Malvika");
        else
            System.out.println("Akshat");
    }
}
