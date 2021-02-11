import java.util.Scanner;

public class Prob734A {
    //Anton and Danik
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();
        int countA = 0, countD = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'A')
                countA++;
            if(ch == 'D')
                countD++;
        }
        if(countA > countD)
            System.out.println("Anton");
        else if(countA < countD)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
