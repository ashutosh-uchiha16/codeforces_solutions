import java.util.Scanner;

public class Prob785A {
    //Anton and Polyhedrons
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] arr = new String[t];
        for(int i = 0; i < t; i++)
            arr[i] = sc.next();
        int faces = 0;

        for(int i = 0; i < t; i++){
            if(arr[i].compareToIgnoreCase("Cube") == 0)
                faces += 6;
            if(arr[i].compareToIgnoreCase("Tetrahedron") == 0)
                faces += 4;
            if(arr[i].compareToIgnoreCase("Octahedron") == 0)
                faces += 8;
            if(arr[i].compareToIgnoreCase("Dodecahedron") == 0)
                faces += 12;
            if(arr[i].compareToIgnoreCase("Icosahedron") == 0)
                faces += 20;
        }
        System.out.println(faces);
    }
}
