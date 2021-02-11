import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob1A {
    //Theatre Square
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lengths = br.readLine().split(" ");
        double n = Integer.parseInt(lengths[0]);
        double m = Integer.parseInt(lengths[1]);
        double a = Integer.parseInt(lengths[2]);
        double ans = Math.ceil(n/a)* Math.ceil(m/a);

        System.out.println((long)(ans) );

    }
}
