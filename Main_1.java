/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import condeforce.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author rn-sshawish
 */
public class Main_1 {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokonize = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokonize.nextToken());
        int m = Integer.parseInt(tokonize.nextToken());
        long [] data = new long[n+2];
        int [] firstPeriod = new int[m];
        int [] lastPeriod = new int[m];
        for (int i = 0; i < m; i++) {
            tokonize = new StringTokenizer(input.readLine());
             firstPeriod[i] = Integer.parseInt(tokonize.nextToken());
             lastPeriod[i] = Integer.parseInt(tokonize.nextToken());
            ++data[firstPeriod[i]];
            --data[lastPeriod[i] + 1];
        }
        int [] b = new int[n+2];
        int total = 0;
        for (int i = 1; i <= n; i++) {
            data[i] += data[i-1];
            b[i] +=b[i-1];
            if (data[i] == 1) {
                ++b[i];
            }
            if (data[i] == 0) {
                ++total;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(total + (b[lastPeriod[i]] - b[firstPeriod[i] - 1]));
        }
    }
}
