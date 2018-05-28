
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
public class Contest490A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        ArrayList<Integer> [] k = new ArrayList [4];
        for (int i = 1; i < k.length; i++) {
            k[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            k[Integer.parseInt(tokn.nextToken())].add(i+1);
        }
        StringBuilder output = new StringBuilder();
        int count = Math.min(k[1].size(), Math.min(k[2].size(), k[3].size()));
        output.append(count).append("\n");
        for (int i = 0; i < count; i++) {
            output.append(k[1].get(i));
            output.append(" ").append(k[2].get(i));
            output.append(" ").append(k[3].get(i)).append("\n");
        }
        System.out.print(output);
    }
}
