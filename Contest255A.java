
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
public class Contest255A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int count [] = new int[3];
        int index = 0;
        int max = Integer.MIN_VALUE;
        int targetIndex = -1;
        for (int i = 0; i < n; i++) {
            count[index]+= Integer.parseInt(tokn.nextToken());
            if (count[index] > max) {
                max = count[index];
                targetIndex = index;
            }
            index = index + 1 == 3 ? 0 : index + 1;
        }
        switch (targetIndex) {
            case 0:
                System.out.println("chest");
                break;
            case 1:
                System.out.println("biceps");
                break;
            default:
                System.out.println("back");
                break;
        }
    }
}
