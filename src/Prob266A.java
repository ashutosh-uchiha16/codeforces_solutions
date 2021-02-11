import java.util.Scanner;

public class Prob266A {
    //Stones on the Table
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String str = sc.next();
        char[] stones = str.toCharArray();
        for(int i = 0; i < stones.length-1; i++){
            if(stones[i] == stones[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
