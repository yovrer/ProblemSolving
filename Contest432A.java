
import java.util.Scanner;

/**
 *
 * @author rn-sshawish
 */
public class Contest432A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int kMember = 5 - m;
        int count   = 0;
        for (int i = 0; i < n; i++) {
            if (input.nextInt() <= kMember) {
                count++;
            }
        }
        System.out.println(count/3);
    }
}
