import java.util.Arrays;
import java.util.Scanner;

public class Prob271A {
    //Beautiful Year
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isDistinct = true;
        for(int i = year +1; i < 9100; i++){
            isDistinct = true;
            Integer temp = i;
            char[] nums = temp.toString().toCharArray();
            for(int x = 0; x < 3; x++){
                for(int y = x+1; y < 4; y++){
                    if(nums[x] == nums[y]){
                        isDistinct = false;
                        break;
                    }
                }
            }
            if(isDistinct) {
                System.out.println(i);
                break;
            }
        }



    }
}
