import java.util.Scanner;

public class Prob580A {
    //Kefa and First Steps
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for(int i = 0; i < t; i++)
            arr[i] = sc.nextInt();
        int max = 1, tempMax = 1;
        for(int i = 1; i < t; i++){
            if(arr[i] >= arr[i-1]){
                tempMax++;
            }
            else
                tempMax = 1;
            max = Math.max(max, tempMax);
        }
        System.out.println(max);
    }
}
