
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
public class Contest915B {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokn.nextToken());
        int position = Integer.parseInt(tokn.nextToken());
        int l = Integer.parseInt(tokn.nextToken());
        int r = Integer.parseInt(tokn.nextToken());
        int result = 0;
        if (l == 1 && r == n) {
            System.out.println(0);
            return;
        }
        if (position == l) {
            if (position != 1) {
                result++;
            }
            if (r != n) {
                result += r - l;
                result++;
            }
        } else if (position == r) {
            if (position != n) {
                result++;
            }
            if (l != 1) {
                result += Math.abs(l - position);
                result++;
            }
        } else if (l == 1) {
            result += Math.abs(r - position);
            result++;
        } else if (n == r) {
            result += Math.abs(l - position);
            result++;
        } else {

            if (Math.abs(l - position) < Math.abs(r - position)) {
                result += Math.abs(l - position);
                result += r - l;
                result += 2;
            } else {
                result += Math.abs(r - position);
                result += r - l;
                result += 2;
            }
        }
        System.out.println(result);

    }
}

//1 2 3 4 5 6 7 8

