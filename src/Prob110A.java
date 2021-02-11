import java.util.Scanner;

public class Prob110A {
    //Nearly Lucky Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == '4' || ch == '7')
                count++;

        }
        if(count == 7 || count == 4)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
