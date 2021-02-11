import java.util.Scanner;

public class Prob266B {
    //Queue at the School
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int iterations = sc.nextInt();
        String seq = sc.next();
        char[] chars = seq.toCharArray();
        while(iterations-- > 0){
            for(int i = 1;i < chars.length; i++){
                if(chars[i-1] == 'B' && chars[i] == 'G'){
                    char temp = chars[i-1];
                    chars[i-1] = chars[i];
                    chars[i] = temp;
                    i++;
                }
            }
        }
        System.out.println(String.valueOf(chars));
    }
}
