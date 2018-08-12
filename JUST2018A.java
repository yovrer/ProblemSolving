import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class JUST2018A {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(input.readLine());
        StringTokenizer tokenizer;
        HashMap<Integer, Integer> values;
        int[] arrValues;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            tokenizer = new StringTokenizer(input.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int q = Integer.parseInt(tokenizer.nextToken());
            values = new HashMap<>();
            arrValues = new int[n];
            tokenizer = new StringTokenizer(input.readLine());
            for (int j = 0; j < n; j++) {
                arrValues[j] = Integer.parseInt(tokenizer.nextToken());
                values.put(arrValues[j], values.getOrDefault(arrValues[j], 0) + 1);
            }
            int moves = values.size();
            if (values.containsKey(0)){
                moves--;
            }
            for (int j = 0; j < q; j++) {
                tokenizer = new StringTokenizer(input.readLine());
                int queryType = Integer.parseInt(tokenizer.nextToken());
                if (queryType == 2) {
                    out.append(moves).append("\n");
                } else {

                    int position = Integer.parseInt(tokenizer.nextToken());
                    int newValue = Integer.parseInt(tokenizer.nextToken());

                    if (values.get(arrValues[position - 1]) == 1) {
                        values.remove(arrValues[position - 1]);
                    } else {
                        values.put(arrValues[position - 1], values.getOrDefault(arrValues[position - 1], 0) - 1);
                    }

                    values.put(newValue, values.getOrDefault(newValue, 0) + 1);

                    moves = values.size();

                    if (values.containsKey(0)){
                        moves--;
                    }

                    arrValues[position - 1] = newValue;
                }
            }
        }
        System.out.println(out.toString().trim());
    }
}


