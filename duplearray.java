import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplearray {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter size of array");
    int m = s.nextInt();
    int[] a = new int[m];
    for (int i = 0; i < a.length; i++) {
        a[i] = s.nextInt();
    }
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
        if (set.contains(a[i])) {
            System.out.println("duplicate " + a[i]);
        } else {
            set.add(a[i]);
        }
    }
}
}
