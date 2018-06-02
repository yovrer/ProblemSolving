import java.util.HashSet;
import java.util.Scanner;

public class Codeforce988A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        HashSet<Integer> dis = new HashSet<>();
        StringBuilder out = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int val = input.nextInt();
            if (!dis.contains(val)) {
                out.append(i+1).append(" ");
                count++;
                dis.add(val);
            }
            if (count == k){
                break;
            }
        }
        if (count == k){
            System.out.println("YES");
            System.out.println(out.toString().trim());
        }else{
            System.out.println("NO");
        }
    }
}
