import java.util.Scanner;

public class Prob677A {
    //Vanya and Fence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfFriends = sc.nextInt();
        int height = sc.nextInt();
        int heightFriends[] = new int[numOfFriends];
        for(int i = 0; i < numOfFriends; i++)
            heightFriends[i] = sc.nextInt();
        int width = 0;
        for(int i : heightFriends){
            if(i <= height)
                width++;
            else
                width +=2;
        }
        System.out.println(width);
    }
}
