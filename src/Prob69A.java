import java.util.Scanner;

public class Prob69A {
    //Young Physicist
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfForces = sc.nextInt();
        int sumX = 0, sumY = 0, sumZ = 0;
        while(numOfForces-- > 0){
            int force[] = new int[3];
            for(int i = 0; i < 3; i++)
                force[i] = sc.nextInt();
            sumX += force[0];
            sumY += force[1];
            sumZ += force[2];
        }
        if(sumX == 0 && sumY == 0 && sumZ == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
