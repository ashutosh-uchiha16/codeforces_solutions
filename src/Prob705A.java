import java.util.Scanner;

public class Prob705A {
    //Hulk
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feelings = sc.nextInt();
        for(int i = 1; i <= feelings; i++){
            if(i % 2 != 0){
                System.out.print("I hate ");
            }
            else {
                System.out.print("I love ");
            }
            if(i == feelings)
                System.out.print("it");
            else
                System.out.print("that ");
        }
    }
}
