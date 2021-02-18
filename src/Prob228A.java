import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob228A {
    //Is your horseshoe on the other hoof?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i <4; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        System.out.println(4 - set.size());

    }
}
