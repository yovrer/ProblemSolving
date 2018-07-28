import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class JUST2018J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        TreeMap<Integer, Pair> frequency;
        for (int i = 0; i < test; i++) {
            int n = input.nextInt();
            frequency = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                int v = input.nextInt();
                Pair pair = frequency.computeIfAbsent(v, (k) -> new Pair(v, 0));
                pair.count++;
            }

            ArrayList<Pair> value = new ArrayList(frequency.values());

            int max = 0;

            for (int j = 0; j < value.size(); j++) {
                if (j != 0 && Math.abs(value.get(j).value - value.get(j - 1).value) <= 1) {
                    max = Math.max(value.get(j).count + value.get(j - 1).count, max);
                } else {
                    max = Math.max(value.get(j).count, max);

                    if (j != 0) {
                        max = Math.max(value.get(j - 1).count, max);
                    }
                }
            }
            System.out.println(max);
        }
    }

    static class Pair {
        int value;
        int count;

        public Pair(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }
}
