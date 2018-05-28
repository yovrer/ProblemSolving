
import java.util.Arrays;
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
public class RookieRank4A {
    static int examRush(int[] tm, int t) {
        Arrays.sort(tm);
        int count = 0;
        for (int i = 0; i < tm.length; i++) {
            t-= tm[i];
            if (t < 0) {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] tm = new int[n];
        for(int tm_i = 0; tm_i < n; tm_i++){
            tm[tm_i] = in.nextInt();
        }
        int result = examRush(tm, t);
        System.out.println(result);
        in.close();
    }
}
