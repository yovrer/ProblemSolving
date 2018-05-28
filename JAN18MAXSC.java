
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
public class JAN18MAXSC {

    public static int max = -1;
    public static int size;

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int[][] data;
        StringTokenizer tokn;
        for (int i = 0; i < n; i++) {
            size = Integer.parseInt(input.readLine());
            max = -1;
            data = new int[size][size];
            for (int k = 0; k < size; k++) {
                tokn = new StringTokenizer(input.readLine());
                for (int j = 0; j < size; j++) {
                    data[k][j] = Integer.parseInt(tokn.nextToken());
                }
                Arrays.sort(data[k]);
            }
            findMaxSum(data, 0, 0, 0);
            System.out.println(max);
        }

    }

    public static boolean findMaxSum(int[][] data, int x, int previousValue, int sum) {
        if (x >= size) {
            max = sum;
            return true;
        }
        for (int i = size - 1; i > -1; i--) {
            if (x == 0) {
                 if (findMaxSum(data, x + 1, data[x][i], sum + data[x][i])) {
                    return true;
                }
            } else {
                if (data[x][i] > previousValue) {
                    if (findMaxSum(data, x + 1, data[x][i], sum + data[x][i])) {
                        return true;
                    } 
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}


