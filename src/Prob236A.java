import java.util.Arrays;
import java.util.Scanner;

public class Prob236A {
    //Boy or Girl
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] != chars[i-1]){
                count++;
            }
        }
        if(count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
