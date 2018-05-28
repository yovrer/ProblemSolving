
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Contest483A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        long start = input.nextLong();
        long end = input.nextLong();
        int distance = (int) (end - start);
        boolean state = false;
        long a = 0;
        long b = 0;
        long c = 0;
        TH:
        for (int j = 0; j <= distance; j++) {
            for (int k = j + 1; k <= distance; k++) {
                for (int l = k + 1; l <= distance; l++) {
                    if ((isCoPrime(start+j, start+k) && isCoPrime(start+k, start+l))&& (!isCoPrime(start+j, start+l))) {
                        a = start+j;
                        b = start+k;
                        c = start+l;
                        state = true;
                        break TH;
                    }
                }
            }
        }
        if (state) {
            System.out.println(String.format("%d %d %d", a, b, c));
        }else{
            System.out.println(-1);
        }
    }

    public static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    public static boolean isCoPrime(long a, long b) {

        return gcd(a, b) == 1;
    }
}
