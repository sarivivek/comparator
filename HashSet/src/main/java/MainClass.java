import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
        Set<String> data = new HashSet<>();
        System.out.println("Enter the number :- ");
        int len = ln.nextInt();
        for (int i =0 ; i<len ; i++) {
            System.out.print("Enter the String :- ");
            data.add(ln.next());
            System.out.println("length = " + data.size());
        }

    }
}
