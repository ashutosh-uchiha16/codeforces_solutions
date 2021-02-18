import java.util.Arrays;
import java.util.Scanner;

public class Prob492B {
    //Vanya and Lanterns
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), l = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        in.close();
        Arrays.sort(a);
        double max = Math.max(a[0], l - a[n - 1]);

        for (int i = 1; i < n; ++i) {
            max = Math.max((a[i] - a[i - 1]) / 2., max);
        }

        System.out.printf("%.10f\n", max);
    }
}
