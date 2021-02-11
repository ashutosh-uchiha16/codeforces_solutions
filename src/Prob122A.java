import java.util.Scanner;

public class Prob122A {
    //Lucky Division
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = {4,7,44,47,74,77,444,447,477,474,744,747,774,777};
        boolean isLucky = false;
        for(int i = 0; i < arr.length; i++){
            if(num % arr[i] == 0){
                isLucky = true;
                break;
            }
        }
        if(isLucky)
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
