/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import condeforce.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author rn-sshawish
 */
public class Contest911A {
    public static void main(String[] args) throws Exception {
        TreeMap<Integer,ArrayList<Integer>> d = new TreeMap<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(tokn.nextToken());
            ArrayList<Integer> position = d.get(m);
            if (position!=null) {
                position.add(i);
            }else{
                position = new ArrayList<>();
                position.add(i);
                d.put(m, position);
            }
        }
        
        ArrayList<Integer> poList = d.get(d.firstKey());
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < poList.size(); i++) {
            min = Math.min(min, poList.get(i) - poList.get(i-1));
        }
        System.out.println(min);
        
    }
}
