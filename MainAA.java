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
public class MainAA{
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int [] data = new int[n];
        for (int i = 0; i < n; i++) {
          data[i] = Integer.parseInt(tokn.nextToken());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j && (data[i] ^ data[j]) == 0) {
                    System.out.println(i+" "+j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}



