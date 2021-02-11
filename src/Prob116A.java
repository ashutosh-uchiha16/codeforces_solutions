import java.util.Scanner;

public class Prob116A {
    //Tram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stops = sc.nextInt();
        int numOfPassengers = 0, max = 0;
        while(stops-- > 0){
            int exits = sc.nextInt();
            int entries = sc.nextInt();
            numOfPassengers = numOfPassengers - exits + entries;
            max = Math.max(max, numOfPassengers);
        }
        System.out.println(max);
    }
}
