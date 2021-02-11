import java.util.Scanner;

public class Prob58A {
    //Chat Room
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        int idx = 0;
        char[] hello = {'h', 'e', 'l', 'l' , 'o'};
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == 'o' && idx == 4){
                System.out.println("YES");
                return;
            }
            if(chars[i] == hello[idx]){
                idx++;
            }

        }
        System.out.println("NO");
    }
}
