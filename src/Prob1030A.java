import java.util.Scanner;

public class Prob1030A {
    //In Search of an Easy Problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for(int i = 0; i < t; i++)
            arr[i] = sc.nextInt();
        for(int i : arr){
            if(i == 1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
