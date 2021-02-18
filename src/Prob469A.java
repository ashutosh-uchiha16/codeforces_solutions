import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Prob469A {
    //I wanna Be the GUY
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int levels = sc.nextInt();
        int p = sc.nextInt();
        int arrP[] = new int[p];

        for(int i = 0; i < p; i++)
            arrP[i] = sc.nextInt();
        int q = sc.nextInt();
        int arrQ[] = new int[q];
        for(int i = 0; i < q; i++)
            arrQ[i] = sc.nextInt();
        int p1 = 0, q1 = 0;
        for(int i = 1; i <= levels; i++){

            if(Arrays.toString(arrP).contains(String.valueOf(i))){
                p1++;
                continue;
            }
            if(Arrays.toString(arrQ).contains(String.valueOf(i))){
                q1++;
                continue;
            }

        }
        if(levels==p1+q1)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");

    }
}
