
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Contest462A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int [] xValue = {1, 0, -1, 0};
        int [] yValue = {0, 1,  0, -1};
        char [][] data = new char[n][n];
        for (int i = 0; i < n; i++) {
            data[i] = input.readLine().toCharArray();
        }
        boolean state = true;
        TH:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int k = 0; k < xValue.length; k++) {
                    int x = i +xValue[k];
                    int y = j + yValue[k];
                    if (check(x, y, n) && data[x][y]=='o') {
                        count++;
                    }
                }
                if (count % 2 !=0) {
                    state =false;
                    break TH;
                }
            }
        }
        if (state) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static boolean check(int x, int y, int n){
        return x >-1 && x < n && y > -1 && y < n; 
    }
}
