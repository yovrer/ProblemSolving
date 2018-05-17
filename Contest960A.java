import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Contest960A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        int [] frequancy = new int[3];
        String order = String.valueOf(word.charAt(0));
        frequancy[word.charAt(0) - 'a']++;
        int index = 0;
        for (int i = 1; i < word.length(); i++) {
            if (order.charAt(order.length() - 1) != word.charAt(i)){
                order+= word.charAt(i);
            }
            frequancy[word.charAt(i) - 'a']++;
        }
        if (order.equals("abc") && (frequancy[0] == frequancy[2] || frequancy[2] == frequancy[1])) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
