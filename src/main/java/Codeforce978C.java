import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Codeforce978C {
    public static void main(String[] args)throws Exception {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokn = new StringTokenizer(input.readLine());

        Long n = Long.parseLong(tokn.nextToken());

        Long m = Long.parseLong(tokn.nextToken());

        tokn = new StringTokenizer(input.readLine());

        ArrayList<Long> value = new ArrayList<>();

        long previous = 0;

        for (int i = 0; i < n; i++) {

            previous =  Long.parseLong(tokn.nextToken()) + previous;

            value.add(previous);
        }

        tokn = new StringTokenizer(input.readLine());

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < m; i++) {

            long position = Long.parseLong(tokn.nextToken());

            int x = Collections.binarySearch(value, position);

            if (x <= -1 ){

               x = x * -1  - 1;
            }

            if (x == 0){

                out.append(x + 1).append(" ").append(position).append("\n");
            }else{

                out.append(x + 1).append(" ").append(position - value.get(x - 1)).append("\n");
            }
        }

        System.out.println(out);

    }

}
