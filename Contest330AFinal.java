
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
public class Contest330AFinal {
    public static void main(String[] args)throws Exception {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int x = Integer.parseInt(tokn.nextToken());
        int y = Integer.parseInt(tokn.nextToken());
        char [][] myInput= new char[x][y];
        String data;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> column = new HashSet<>();
        for (int i = 0; i < x; i++) {
            data = input.readLine();
            for (int j = 0; j < y; j++) {
                myInput[i][j] = data.charAt(j);
                if (data.charAt(j)=='S') {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        
        System.out.println(((y-column.size())*x)+((x-row.size())*y)-((x-row.size())*(y-column.size())));
//        ((y-column.size())*x)+((x-row.size())*y)-((x-row.size())*(y-column.size()))
    }
}
