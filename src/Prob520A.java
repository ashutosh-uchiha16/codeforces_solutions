import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob520A {
    //Pangram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>(26);
        int counter = 0;
        for(char c : str.toCharArray()){
            set.add(c);

        }
        if(set.size() == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
