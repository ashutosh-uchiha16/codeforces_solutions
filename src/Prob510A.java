import java.util.Scanner;

public class Prob510A {
    //Fox And Snake
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean left = false;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < m; j++)
                    System.out.print("#");
            } else {

                if(left){
                    System.out.print("#");
                    for(int j = 1; j < m; j++)
                        System.out.print(".");
                } else {
                    for(int j = 0; j < m-1; j++)
                        System.out.print(".");
                    System.out.print("#");

                }
                left = !left;
            }
            System.out.println();
        }
    }
}
