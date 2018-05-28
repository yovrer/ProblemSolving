
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
public class UVA100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int i = input.nextInt();
            int j = input.nextInt();
            long max = Integer.MIN_VALUE;
            for (int k = Math.min(i, j); k <= Math.max(i, j); k++) {
                max = Math.max(getCount(k, 0L), max);
            }
            System.out.println(i+" "+j+" "+max);
        }

    }

    public static long getCount(long n, long count) {
        if (n == 1) {
            return ++count;
        }
        count++;
        if (n % 2L == 0) {
            return getCount(n / 2L, count);
        } else {
            return getCount(3L * n + 1L, count);
        }
    }
}
