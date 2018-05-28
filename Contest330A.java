
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Contest330A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int x = Integer.parseInt(tokn.nextToken());
        int y = Integer.parseInt(tokn.nextToken());
        boolean [] row = new boolean[x];
        boolean [] column = new boolean[y];
        char [][] myInput= new char[x][y];
        String data;
        for (int i = 0; i < x; i++) {
            data = input.readLine();
            for (int j = 0; j < y; j++) {
                myInput[i][j] = data.charAt(j);
                if (data.charAt(j)=='S') {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!row[i] || !column[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
