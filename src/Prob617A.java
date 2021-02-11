import java.util.Scanner;

public class Prob617A {
    //Elephant
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dest = sc.nextInt();
        int steps = 0;
        while(dest > 0){
            if(dest >= 5)
                dest -= 5;
            else if(dest == 4)
                dest -= 4;
            else if(dest == 3)
                dest -= 3;
            else if(dest == 2)
                dest -= 2;
            else if(dest == 1)
                dest -= 1;

            steps++;
        }
        System.out.println(steps);
    }
}
