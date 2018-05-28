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
public class Contest902A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int [] state = new int[m+2];
        for (int i = 0; i < n; i++) {
            int start = input.nextInt();
            if (start == 0) {
                 state[start] += 1;
            }else{
            state[start+1] += 1;
            }
            
            state[input.nextInt()+1] += -1;
        }
        boolean st = true;
        for (int i = 1; i <= m; i++) {
            state[i] = state[i] + state[i-1];
            if (state[i]==0) {
                st = false;
                break;
            }
        }
        if (st) {
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}

