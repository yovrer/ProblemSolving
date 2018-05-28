
import java.util.Arrays;
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
public class Contest940A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }
        Arrays.sort(values);
        int max = 0;
        for (int i = 0; i < values.length; i++) {
            int ans = 1;
            for (int j = values.length - 1; j > -1; j--) {
                if (values[j] - values[i] <= d) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
            max = Math.max(ans, max);
        }
        System.out.println(n - max);
    }

    static int findDistanceLeft(int[] values, int target, int d) {
        int distance = target + 1;
        for (int i = target + 1; i < values.length; i++) {
            if (values[i] - values[0] <= d) {
                distance++;
            }
        }
        return distance;
    }

    static int findDistanceRight(int[] values, int target, int d) {
        int distance = 1;
        for (int i = 0; i < target; i++) {
            if (values[i] - values[0] <= d) {
                distance++;
            }
        }
        return distance;
    }

    static int findDistanceNotFoundLeft(int[] values, int target, int d) {
        int distance = 0;
        for (int i = target + 1; i < values.length; i++) {
            if (values[i] - values[0] <= d) {
                distance++;
            }
        }
        return distance;
    }

    static int findDistanceRightNotFound(int[] values, int target, int d) {
        int distance = 0;
        for (int i = 1; i < target; i++) {
            if (values[i] - values[0] <= d) {
                distance++;
            }
        }
        return distance;
    }

}
