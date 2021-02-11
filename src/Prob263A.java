import java.util.Scanner;

public class Prob263A {
    //Beautiful Matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++)
                matrix[i][j] = sc.nextInt();
        }
        for(int i =0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(matrix[i][j] == 1){
                    System.out.println(Math.abs(2 - i) + Math.abs(2 - j));
                    break;
                }
            }
        }
    }
}
