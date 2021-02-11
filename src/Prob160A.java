import java.util.Arrays;
import java.util.Scanner;

public class Prob160A {
    //Twins
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCoins = sc.nextInt();
        int coinValues[] = new int[numOfCoins];
        int totalValue = 0;
        for(int i = 0; i < numOfCoins; i++){
            coinValues[i] = sc.nextInt();
            totalValue += coinValues[i];
        }
        int half = totalValue/2;
        Arrays.sort(coinValues);
        int count = 0, tempTotal = 0;
        for(int i = coinValues.length-1; i >= 0; i--){
            if(tempTotal > half){

                break;
            }
            tempTotal += coinValues[i];
            count++;

        }

            System.out.println(count);
    }
}
