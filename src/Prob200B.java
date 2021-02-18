import java.util.Scanner;

public class Prob200B {
    //Drinks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfDrinks = sc.nextInt();
        int percent[] = new int[numOfDrinks];
        Double sum = 0.0;
        for(int i = 0; i < numOfDrinks; i++) {
            percent[i] = sc.nextInt();
            sum += percent[i];
        }
        System.out.println(sum / numOfDrinks);
    }
}
