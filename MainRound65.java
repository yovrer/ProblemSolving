
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
public class MainRound65 {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String p = input.readLine();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            out.append(p.charAt(s.charAt(i) - 'a'));
        }
        System.out.println(out);
    }
}
