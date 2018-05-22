import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Codeforce985B {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokn.nextToken());
        int m = Integer.parseInt(tokn.nextToken());
        char [][] board = new char[n][];
        for (int i = 0; i < n; i++) {
            board[i] = input.readLine().toCharArray();
        }

        HashMap<Integer, Integer> lamps = new HashMap<>();


        HashMap<Integer, ArrayList<Integer>> switching = new HashMap<>();


        for (int i = 0; i < n; i++) {
            ArrayList<Integer> lam = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '1') {
                    lam.add(j);
                    lamps.put(j, lamps.getOrDefault(j, 0) + 1);
                }
            }
            switching.put(i, lam);
        }

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> val  = switching.get(i);
            boolean state = true;
            for (int j = 0; j < val.size(); j++) {
                if (lamps.get(val.get(j)) <= 1){
                    state = false;
                    break;
                }
            }
            if (state){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
