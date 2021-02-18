import java.util.Arrays;
import java.util.Scanner;

public class Prob337A {
    //Puzzles
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int numOfPuzzles = sc.nextInt();
        int puzzles[] = new int[numOfPuzzles];
        for(int i = 0; i < numOfPuzzles; i++)
            puzzles[i] = sc.nextInt();
        Arrays.sort(puzzles);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numOfPuzzles - numOfStudents + 1; i++){
            min = Math.min(min, puzzles[i + numOfStudents - 1] - puzzles[i]);
        }
        System.out.println(min);
    }
}
