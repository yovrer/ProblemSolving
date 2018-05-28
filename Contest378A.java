
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
public class Contest378A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int a = Integer.parseInt(tokn.nextToken());
        int b = Integer.parseInt(tokn.nextToken());
        int firWin = 0;
        int drowWin = 0;
        int secandWin = 0;
                
        for (int i = 1; i < 7; i++) {
            if (Math.abs(a- i) <  Math.abs(b - i)) {
                firWin++;
            }else if (Math.abs(a- i) == Math.abs(b - i)) {
                drowWin++;
            }else{
                secandWin++;
            }
        }
        System.out.println(firWin+" "+ drowWin+ " " + secandWin);
    }
}
