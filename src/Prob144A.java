import java.util.Scanner;

public class Prob144A {
    //Arrival of the General
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int minIndex = 0, maxIndex = 0, min = 101, max = 0;
        for(int i = 0; i < n ;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] <= min){
                min = arr[i];
                minIndex = i;
            }
        }
        if(maxIndex > minIndex){
            System.out.println(maxIndex + n - minIndex - 2);

        }
        else
            System.out.println(maxIndex + n- minIndex - 1);
    }
}
