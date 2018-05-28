/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Don't place your source in a package

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Please name your class Main
class Main_2 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokonize = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokonize.nextToken());
        int m = Integer.parseInt(tokonize.nextToken());;

        int[][] data = new int[m][2];
        int[] boards = new int[n + 1];

        for (int i = 0; i < m; i++) {
            tokonize = new StringTokenizer(in.readLine());
            data[i][0] = Integer.parseInt(tokonize.nextToken());
            data[i][1] = Integer.parseInt(tokonize.nextToken());

            for (int j = data[i][0]; j <= data[i][1]; j++) {
                boards[j]++;
            }
        }
        int count = 0;
        for (int i = 1; i < boards.length; i++) {
            if (boards[i] == 0) {
                count++;
            }
        }

        for (int[] data1 : data) {
            int result = count;
            for (int j = data1[0]; j <= data1[1]; j++) {
                if (boards[j]==1) {
                    result++;   
                }
            }
            System.out.println(result);
        }

    }
}
