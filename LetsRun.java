
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
public class LetsRun {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(input.readLine());
        StringTokenizer tokn;
        int [] data ;
        for (int i = 0; i < q; i++) {
            tokn = new StringTokenizer(input.readLine());
            long speed = Integer.parseInt(tokn.nextToken());
            int times = Integer.parseInt(tokn.nextToken());
            int increase = Integer.parseInt(tokn.nextToken());
            int n = Integer.parseInt(tokn.nextToken());
            long first = 0;
            long secand = 0;
            int index =  1 ;
            for (int j = 0; j < n; index++) {
                if (index % 2 != 0) {
                    long in = times;
                    if (j + in > n) {
                        in = n - j;
                        j+= times;
                    }else{
                        j+=times;
                    }
                    first += speed * in ;
                }else{
                     long in = times;
                    if (j + in > n) {
                        in = n - j;
                        j+= times;
                    }else{
                        j+=times;
                    }
                    secand += speed * in;
                }
                speed *= increase;
            }
            System.out.println(Math.abs(first - secand));
        }
    }
}



