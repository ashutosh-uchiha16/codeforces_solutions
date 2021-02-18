import java.util.Scanner;

public class Prob268A {
    //Games
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr1[] = new int[t], arr2[] = new int[t];
        for(int i = 0; i < t; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < t; i++){
            for(int j = 0; j < t; j++){
                if(arr1[i] == arr2[j])
                    count++;
            }
        }
        System.out.println(count);

    }
}
