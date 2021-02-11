import java.util.Scanner;

public class Prob282A {
    //Bit++
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfOps = sc.nextInt();
        sc.nextLine();
        int x = 0;
        while(numOfOps-- > 0){
            String st = sc.nextLine();
            if(st.charAt(0) == '+' || st.charAt(2) == '+')
                x++;
            else if(st.charAt(0) == '-' || st.charAt(2) == '-')
                x--;
        }
        System.out.println(x);
    }
}
