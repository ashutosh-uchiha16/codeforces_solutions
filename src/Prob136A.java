import java.util.Scanner;

public class Prob136A {
    //Presents
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfFriends = sc.nextInt();
        int friendGift[] = new int[numOfFriends];
        for(int i = 0; i < numOfFriends; i++)
            friendGift[i] = sc.nextInt();
        int[] receiveGift = new int[numOfFriends];

        for(int i = 0; i < numOfFriends; i++){
            int temp = friendGift[i];
            receiveGift[temp - 1] = i +1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : receiveGift)
            sb.append(i + " ") ;
        System.out.println(sb);
    }
}
