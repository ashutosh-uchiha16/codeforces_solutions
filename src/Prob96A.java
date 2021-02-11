import java.util.Scanner;

public class Prob96A {
    //Football
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] pos = str.toCharArray();
        int count0 = 0, count1 = 0;
        boolean isDangerous = false;
        for(int i = 0; i < pos.length; i++){
            if(pos[i] == '0') {
                count0++;
                count1 = 0;
            }
            if(pos[i] == '1') {
                count1++;
                count0 = 0;
            }
            if(count0 == 7 || count1 == 7){
                isDangerous = true;
                break;
            }

        }
        if(isDangerous)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
