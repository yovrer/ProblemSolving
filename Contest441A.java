
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
public class Contest441A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int v = input.nextInt();
        StringBuilder out = new StringBuilder();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int k = input.nextInt();
            int count = 0;
            for (int j = 0; j < k; j++) {
                if (input.nextInt() < v) {
                    count++;
                }
            }
            if (count > 0) {
                out.append(i).append(" ");
                result++;
            }
        }
        System.out.println(result);
        String output = out.toString().trim();
        System.out.println(output);
    }
}
