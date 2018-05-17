import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforces984B {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokn.nextToken());
        int m = Integer.parseInt(tokn.nextToken());
        char [][] boomBord = new char[n][];
        for (int i = 0; i < n; i++) {
            boomBord[i] = input.readLine().toCharArray();
        }
        int [] x  = {0, 1, -1, 0, 1, 1, -1, -1};
        int [] y  = {1, 0, 0, -1, 1, -1, 1, -1};
        boolean state = true;
        TH:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Character.isDigit(boomBord[i][j]) || boomBord[i][j] =='.'){
                    int cellCountBoom =  0;
                    if (Character.isDigit(boomBord[i][j])) {
                        cellCountBoom = boomBord[i][j] - '0';
                    }
                        int count = 0;
                        for (int k = 0; k < x.length ; k++) {
                            int x1 = i + x[k];
                            int y1 = j + y[k];
                            if (check(n, m, x1, y1) && boomBord[x1][y1] == '*'){
                                count++;
                            }
                        }
                        if (count != cellCountBoom){
                            state = false;
                            break TH;
                        }
                }
            }
        }

        if (state) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static boolean check(int n, int m, int x, int y){
        return  x > -1 && y > -1 && x < n && y < m ;
    }
}
