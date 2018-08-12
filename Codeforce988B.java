import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Codeforce988B {
    public static void main(String[] args)throws Exception {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        Pair [] words  =  new Pair[n];

        for (int i = 0; i < n; i++) {

            words[i] = new Pair(input.readLine());
        }

        if (n == 1){
            System.out.println("YES");
            System.out.println(words[0].word);
            return;
        }

        Arrays.sort(words);

        for (int i = 0; i < n - 1; i++) {

            if (!words[i + 1].word.contains(words[i].word)){

                System.out.println("NO");
                return;
            }
        }


        System.out.println("YES");

        StringBuilder out = new StringBuilder();

        for (Pair word : words) {

            out.append(word.word).append("\n");
        }

        System.out.println(out.toString().trim());
    }

}


class Pair implements  Comparable<Pair>{
    String word;

    public Pair(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(Pair pair) {
        return  this.word.length() -  pair.word.length();
    }
}