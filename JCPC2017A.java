/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author rn-sshawish
 */
public class JCPC2017A {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new FileReader("tabs.in"));
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn ;
        for (int i = 0; i < n; i++) {
            tokn = new StringTokenizer(input.readLine());
            int tabs = Integer.parseInt(tokn.nextToken());
            int currentTab = Integer.parseInt(tokn.nextToken());
            if (tabs == 1) {
                System.out.println(0);
            }else if (currentTab == 1 || currentTab == tabs) {
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
        
    }
}
