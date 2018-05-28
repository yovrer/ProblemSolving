
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
public class CSRound70BFinal1 {

    static int x1, y1;

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        x1 = Integer.parseInt(tokn.nextToken());
        y1 = Integer.parseInt(tokn.nextToken());

        int[][] data = new int[x1][y1];

        for (int i = 0; i < x1; i++) {
            tokn = new StringTokenizer(input.readLine());
            for (int j = 0; j < y1; j++) {
                data[i][j] = Integer.parseInt(tokn.nextToken());
            }
        }
        int max = -1;
        for (int i = 0; i < x1 - 1; i++) {
            for (int j = 0; j < y1 - 1; j++) {
                if (data[i][j] == 1) {
                    int countLeft = 1;
                    for (int k = j + 1; k < y1; k++) {
                        int countDown = 0;
                        if (data[i][k] != 1) {
                            break;
                        } else {
                            countLeft++;
                        }
                        boolean flage = false;
                        for (int l = i + 1; l < x1; l++) {
                            if (data[l][k] == 1) {
                                countDown++;
                                flage = true;
                            } else {
                                break;
                            }
                        }
                        if (flage) {
                            max = Math.max(max, countDown + countLeft);
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
