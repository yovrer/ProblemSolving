
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
public class Contest496A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2 ; i++) {
            if (Math.abs(values[i] - values[i+2]) < min) {
                index = i+1;
                min = Math.abs(values[i] - values[i+2]);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n-1; i++) {
            if (i == index ) {
                continue;
            }
            int firstValue = i;
            if (i+1 == n && i+1 == index) {
                break;
            }
            int secandValue = i+1==index? i+2: i+1;
            if (Math.abs(values[firstValue] - values[secandValue]) > max) {
             max = Math.abs(values[firstValue] - values[secandValue]);
            }
        }
        System.out.println(max);
    }
}
