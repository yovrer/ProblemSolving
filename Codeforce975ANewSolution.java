import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Codeforce975ANewSolution {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        boolean [] frequency = new boolean[26] ;
        String word;
        StringBuilder distictWordp = new StringBuilder();
        HashSet<String> root = new HashSet<>();
        for (int i = 0; i < n; i++) {
            word = tokn.nextToken();
            for (char letter: word.toCharArray() ) {
                frequency[letter - 'a'] = true;
            }
            for (int j = 0; j < 26; j++) {
                if (frequency[j]){
                    distictWordp.append((char)(j + 'a'));
                }
            }

            root.add(distictWordp.toString());
            Arrays.fill(frequency, false);
            distictWordp.delete(0, distictWordp.length());
        }
        System.out.println(root.size());
    }
}
