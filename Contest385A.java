
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
public class Contest385A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = input.nextInt();
        int max = Integer.MIN_VALUE;
        int [] value  = new int[n];
        for (int i = 0; i < n; i++) {
            value [i]  = input.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            if (value[i] - value[i+1] > max) {
                max = value[i] - value[i+1];
            }
        }
        max -= c;
        if (max <= 0) {
            System.out.println(0);
        }else{
            System.out.println(max);
        }
    }
}
