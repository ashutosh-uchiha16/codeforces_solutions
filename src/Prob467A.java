import java.util.Scanner;

public class Prob467A {
    //George and Accommodation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfRooms = sc.nextInt();
        int count = 0;
//        int roomAvailability[] = new int[2];
        while(numOfRooms-- > 0){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q - p >= 2)
                count++;
        }
        System.out.println(count);
    }
}
