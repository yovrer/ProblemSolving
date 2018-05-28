
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
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
public class ClosestNumbers {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new  BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(input.readLine());
        ArrayList<Integer> data = new ArrayList<>(n);
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            data.add(Integer.parseInt(tokn.nextToken()));
        }
        Collections.sort(data);
        int min = Integer.MAX_VALUE;
        
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            if (data.get(i).equals(data.get(i+1)) ) {
                continue;
            }
            
            boolean found = false;
            if (Math.abs(data.get(i) - data.get(i+1)) < min) {
                min = Math.abs(data.get(i) - data.get(i+1));
                values.clear();
                values.add(data.get(i));
                values.add(data.get(i+1));
                found = true;
            }else if (Math.abs(data.get(i) - data.get(i+1)) == min) {
                values.add(data.get(i));
                values.add(data.get(i+1));
                found = true;
            }
            
            if (Math.abs(data.get(i+1) - data.get(i)) < min && !found) {
                
                 min = Math.abs(data.get(i+1) - data.get(i));
                values.clear();
                values.add(data.get(i));
                values.add(data.get(i+1));
            }else if (Math.abs(data.get(i+1) - data.get(i)) == min && !found) {
                values.add(data.get(i));
                values.add(data.get(i+1));
            }
        }
        StringBuilder out = new StringBuilder();
        values.forEach((value) -> {
            out.append(value).append(" ");
        });
        System.out.println(out.toString().trim());
        
    }
}
