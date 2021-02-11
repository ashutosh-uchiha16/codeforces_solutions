import java.util.Scanner;

public class Prob158A {
    //Next Round
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();

        }
        int i = 0;
        while(i < n){
            if(scores[i] == 0){
                i++;
                continue;
            }

            if(i <= k && scores[i] >= scores[k-1])
                count++;
            if(i > k && scores[k-1] == scores[i])
                count++;
            i++;
        }
        System.out.println(count);

    }
}
