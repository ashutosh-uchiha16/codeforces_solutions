import java.util.Scanner;

public class Prob25A {
    //IQ test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int even = 0, odd = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        if(even > odd){
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 != 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
