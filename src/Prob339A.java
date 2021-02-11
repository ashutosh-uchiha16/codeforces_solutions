import java.util.Arrays;
import java.util.Scanner;

public class Prob339A {
    //Helpful Maths
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int nums[] = new int[(str.length()/2) + 1];
        int index = 0;
        for(char ch : str.toCharArray()){
            if(ch != '+'){
                nums[index] = Character.getNumericValue(ch);
                index++;
            }
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            System.out.print(nums[i] + "+");
        }
        System.out.println(nums[nums.length-1]);


    }
}
