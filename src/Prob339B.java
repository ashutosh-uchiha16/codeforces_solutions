import java.util.Scanner;

public class Prob339B {
    //Xenia and RingRoad
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int loc = 1;
        long count = 0;
        while(m-- > 0){
            int pos = sc.nextInt();
            if(pos >= loc)
                count += pos - loc;
            else
                count+= n - (loc - pos);
            loc = pos;
        }
        System.out.println(count);
    }
}
