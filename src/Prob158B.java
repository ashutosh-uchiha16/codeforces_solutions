import java.util.Arrays;
import java.util.Scanner;

public class Prob158B {
    //Taxi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGroups = sc.nextInt();
        int friendGroups[] = new int[numGroups];
        for(int i = 0; i < numGroups; i++)
            friendGroups[i] = sc.nextInt();
        int numOfTaxis = 0 ;
        int count[] = new int[5];
        for(int i : friendGroups){
            count[i]++;
        }
        numOfTaxis += count[4];
        int min13 =  Math.min(count[1],count[3] );
        numOfTaxis += min13;
        count[1] -= min13;
        count[3] -= min13;
        numOfTaxis += count[2]/2;
        numOfTaxis += count[3];
        count[2] %= 2;
        if(count[2] == 1 && count[1] >= 2){
            numOfTaxis++;
            count[2] = 0;
            count[1] -= 2;
        }
        numOfTaxis += Math.ceil((count[1] + count[2])/4f);
        System.out.println(numOfTaxis);


    }
}
