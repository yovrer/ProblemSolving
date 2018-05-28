/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author rn-sshawish
 */
public class Main5_2 {
    public static void main(String[] args) {
        MyScanner input = new MyScanner(System.in);
        int n = input.nextInt();
        int [] data = new int[n];
        int [] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = input.nextInt();
        }
        for (int i = n-1 ; i > 0; i--) {
            if (left[i]!=left[i-1]) {
                data[i-1] = 1;
            }
        }
         for (int i = 0; i < n; i++) {
            left[i] = input.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (left[i] != left[i+1]) {
                data[i+1] = 1;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (data[i]==1) {
                s.append('0');
            }else{
                s.append('1');
            }
        }
        System.out.println(s);
    }
    static class MyScanner {

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
}

