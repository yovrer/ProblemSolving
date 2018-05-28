/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author rn-sshawish
 */
public class NewMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        long[] a = new long[n + 2];
        int[] l = new int[m];
        int[] r = new int[m];
        
        for(int i = 0; i < m; i++){
            l[i] = in.nextInt();
            r[i] = in.nextInt();
            a[l[i]] += 1;
            a[r[i] + 1] -= 1;
        }
        int[] b = new int[n + 2];
        int total = 0;

        for(int i = 1; i <= n; i++){
            a[i] += a[i - 1];
            b[i] += b[i - 1];
            if(a[i] == 1)
                b[i]++;
            if(a[i] == 0) total++;
        }
        
        for(int i = 0; i < m; i++){
            System.out.println(total + (b[r[i]] - b[l[i] - 1]));
        }
    }
}
