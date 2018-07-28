import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUST2018F {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(input.readLine());
        StringTokenizer tokenizer;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < test; i++) {
            tokenizer = new StringTokenizer(input.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            long hours = 0;
            long minutes = 0;
            for (int j = 0; j < n; j++) {
                tokenizer = new StringTokenizer(input.readLine());

                minutes += getWorkingHours(tokenizer.nextToken(), tokenizer.nextToken());

                hours += minutes / 60;

                minutes = minutes % 60;

            }
            if (hours >= m) {
                out.append("YES").append("\n");
            } else {
                out.append("NO").append("\n");
            }
        }
        System.out.println(out.toString().trim());
    }

    public static long getWorkingHours(String start, String end) throws Exception {

        long count = 0;

        StringTokenizer tokenizer = new StringTokenizer(start, ":");

        int startHour = Integer.parseInt(tokenizer.nextToken());

        int startMinutes = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(end, ":");

        int endHour = Integer.parseInt(tokenizer.nextToken());

        int endMinutes = Integer.parseInt(tokenizer.nextToken());

        count += endMinutes;

        if (startMinutes > 0) {
            startHour++;
            count += 60 - startMinutes;
        }

        int hours = endHour - startHour;

        count += hours * 60;

        return count;
    }
}
