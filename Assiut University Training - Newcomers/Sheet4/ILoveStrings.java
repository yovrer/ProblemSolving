package Sheet4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Suhaib Abu Shawish
 *
 * @date 01/06/2018
 *
 * */


public class ILoveStrings {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String word1, word2;
        StringBuilder out;
        StringTokenizer tokn;
        for (int i = 0; i < n; i++) {
            tokn = new StringTokenizer(input.readLine());
            word1 = tokn.nextToken();
            word2 = tokn.nextToken();
            out = new StringBuilder();
            int j= 0 , k = 0;
            for (; j < word1.length() && k < word2.length(); ) {
                if (j == k){
                    out.append(word1.charAt(j));
                    j++;
                }else{
                    out.append(word2.charAt(k));
                    k++;
                }
            }
            if (j == word1.length() && k != word2.length()){
                out.append(word2.substring(k));
            }
            if (j != word1.length() && k == word2.length()){
                out.append(word1.substring(j));
            }
            System.out.println(out);
        }
    }
}
