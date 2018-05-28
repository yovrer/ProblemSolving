
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Contest404A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        char [][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            board[i] =input.readLine().toCharArray();
        }
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = n - 1;
        char diagonal = board[0][0];
        char another = board[0][1];
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
