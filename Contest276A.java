
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
public class Contest276A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int f = input.nextInt();
            int t = input.nextInt();
            int result = 0;
            if (t > k) {
                result += f - (t - k);
            }else{
                result = f;
            }
            max = Math.max(result, max);
        }
        System.out.println(max);
    }
}
