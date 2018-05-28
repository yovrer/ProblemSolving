
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
public class CSRound70B {

    static int x1, y1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        x1 = input.nextInt();
        y1 = input.nextInt();

        int[][] data = new int[x1][y1];

        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                data[i][j] = input.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                if (data[i][j] == 1) {
                    max = Math.max(max, findMaxPath(data, i, j));
                }
            }
        }
        System.out.println(max);
    }

    public static int findMaxPath(int[][] data, int x, int y) {

        int firstMax = 0;
        if (check(x + 1, y, data)) {
            firstMax = findMaxPath(data, x + 1, y);
        }

        int secandMax = 0;
        if (check(x, y + 1, data)) {
            secandMax = findMaxPath(data, x, y + 1);
        }

        return 1 + Math.max(firstMax, secandMax);
    }

    static boolean check(int x, int y, int[][] data) {
        return x > -1 && x < x1 && y > -1 && y < y1 && data[x][y] == 1;
    }

}
