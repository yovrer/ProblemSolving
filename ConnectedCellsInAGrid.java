
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
public class ConnectedCellsInAGrid {

    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(input.readLine());
        m = Integer.parseInt(input.readLine());
        String[][] board = new String[n][];
        for (int i = 0; i < n; i++) {
            board[i] = input.readLine().split(" ");
        }
        System.out.println(floodFill(board));
    }

    public static int floodFill(String[][] board) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!board[i][j] .equals("1") ) {
                    continue;
                }
                board[i][j] = "0";
                max = Math.max(visit(i, j, board) + 1, max);

            }
        }

        return max;
    }

    public  static int visit(int x, int y, String[][] board) {
        int[] xValue = {1, 1, 0, -1, -1, 0, -1, 1};
        int[] yValue = {1, 0, 1, -1, 0, -1, 1, -1};
        int sum = 0;
        for (int k = 0; k < xValue.length; k++) {
            if (check(x + xValue[k], y + yValue[k]) && !board[x + xValue[k]][y + yValue[k]].equals("0")) {
               sum++;
               board[x + xValue[k]][y + yValue[k]] = "0";
               sum+=visit(x + xValue[k], y + yValue[k], board);
            }
        }
        return sum;
    }

    public static boolean check(int x, int y) {

        return x > -1 && x < n && y > -1 && y < m;
    }
}

