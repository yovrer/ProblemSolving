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
public class Solution3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int[] period = new int[n + 2];
        for (int i = 0; i < m; i++) {
            int position = input.nextInt();
            int startPeriod = Math.max(0, position - k);
            int endPeriod = Math.min(n, position + k);
            period[startPeriod]++;
            period[endPeriod + 1]--;

        }
        int size = 2 * k + 1;
        int startPoint = -1;
        int endPoint = -1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            period[i] += period[i - 1];
            if (period[i] == 0 && startPoint == -1) {
                startPoint = i;
            }else  if (period[i] == 0){
                
                if ((i - startPoint + 1) >= size ) {
                    startPoint = -1;
                    endPoint = -1;
                    total++;
                }else {
                    endPoint = i;
                }
            }
        }
        if (startPoint != -1) {
            total++;
        }
        System.out.println(total);

    }

}
