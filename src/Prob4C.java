import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prob4C {
    //Registration system
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        while(n-- > 0){
            String str = sc.next();
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
                System.out.println(str + map.get(str));
            } else {
                map.put(str,0);
                System.out.println("OK");
            }
        }
        sc.close();
    }
}
