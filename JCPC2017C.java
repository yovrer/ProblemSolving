/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author rn-sshawish
 */
public class JCPC2017C {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new FileReader("scoreboard.in"));
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn ;
        boolean [] state = null ;
        for (int i = 0; i < n; i++) {
           state = new boolean[13];
           int solvedProblem = Integer.parseInt(input.readLine());
           String words = input.readLine();
            for (int j = 0; j < solvedProblem; j++) {
                state[words.charAt(j) - 'A'] = true;
            }
            int max = Integer.MIN_VALUE;
            char problem = ' ';
            tokn = new StringTokenizer(input.readLine());
            for (int j = 0; j < 13; j++) {
                int value = Integer.parseInt(tokn.nextToken());
                if (!state[j] && value > max) {
                    max = value;
                    problem = (char)('A' + j);
                }
            }
            System.out.println(problem);
        }
    }
}
