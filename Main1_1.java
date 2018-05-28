/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author rn-sshawish
 */
public class Main1_1 {
    public static void main(String[] args) {
       // MyScanner input = new MyScanner(System.in);
//        System.out.println(Math.pow(2, 3)* Math.pow(4, 3) * Math.pow(5, 2) * Math.pow(17, 2));
//System.out.println(3976036 / 21);
//                   215187
System.out.println(19 * 19);
//        int count = 0;
//        for (int i = 1; i < 3699197; i++) {
//            if (3699197 % i == 0) {
//                count++;
//            }
//        }
        System.out.println(1994 * 1994 );
        System.out.println(19 * 19 );
//        System.out.println(3976036 /361 );
//        System.out.println(3976036 /361 );
        System.out.println(10247 *21 + 21);

    }
}
//


class MyScanner {

    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public MyScanner(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

}


class MyPair {
    int edge;
    int count;
    ArrayList<Integer> myVisit;
}