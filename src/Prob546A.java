import java.util.Scanner;

public class Prob546A {
    //Soldier and Bananas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costOfOne = sc.nextInt();
        int hasMoney = sc.nextInt();
        int numOfBananas = sc.nextInt();
        int totalMoney = 0;
        for(int i = 1; i <= numOfBananas; i++){
            totalMoney += (i * costOfOne);
        }
        int ans = (totalMoney - hasMoney) > 0 ? (totalMoney - hasMoney) : 0;
        System.out.println(ans);
    }
}
