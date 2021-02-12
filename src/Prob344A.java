import java.util.Scanner;

public class Prob344A {
    //Magnets
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfMagnets = sc.nextInt();
        int magnetPos[] = new int[numOfMagnets];
        for(int i = 0; i < numOfMagnets; i++)
            magnetPos[i] = sc.nextInt();
        int countOfGroups = 1;
        for(int i = 1; i < numOfMagnets; i++){
            if(magnetPos[i] != magnetPos[i-1])
                countOfGroups++;
        }
        System.out.println(countOfGroups);
    }
}
