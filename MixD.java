import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MixD {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        double n = Integer.parseInt(tokn.nextToken());
        int m =  Integer.parseInt(tokn.nextToken());
        int c =  Integer.parseInt(tokn.nextToken());
        ArrayList<Integer> removedValue =  new ArrayList<>(m);
        tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < m; i++) {
            removedValue.add(Integer.parseInt(tokn.nextToken()));
        }
        Collections.sort(removedValue);
        int q = Integer.parseInt(input.readLine());
        tokn = new StringTokenizer(input.readLine());
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int value = Integer.parseInt(tokn.nextToken());
            double  numberOfRemoveValue = (Collections.binarySearch(removedValue, value) * -1) - 1 ;
            int  x = (int) Math.ceil((value - numberOfRemoveValue)/ c);
            int y =(int) (value - numberOfRemoveValue) % c;
            out.append( x + " " + (y==0? c: y)).append("\n");
        }
        System.out.print(out);
    }

}
