
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
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
public class MainB {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> map = new HashSet<>();
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            map.add(Integer.parseInt(tokn.nextToken()));
        }
        solve(map.size());
    }
    
    public static int fact (int n){
        int d = 1;
        for (int i = n; i > 0; i--) {
            d*= n;
        }
        return n;
    }
    
    public static void solve(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += fact(n)/fact(n-i);
        }
        System.out.println(sum+1);
    }
}

