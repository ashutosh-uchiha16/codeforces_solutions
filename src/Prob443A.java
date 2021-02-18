import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob443A {
    //Anton and Letters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<Character> set = new HashSet<>();
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'a' && chars[i] <= 'z' )
                set.add(chars[i]);
        }
        System.out.println(set.size());
    }
}
