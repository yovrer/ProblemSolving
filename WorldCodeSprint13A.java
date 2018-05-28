import java.io.*;
import java.util.*;

public class WorldCodeSprint13A {

    // Complete the findTheAbsentStudents function below.
    static int[] findTheAbsentStudents(int n, int[] a) {
        // Return the list of student IDs of the missing students in increasing order.

        boolean [] values = new boolean[n];

        int count = 0;

        for (int value : a) {

            if (!values[value - 1]){
                count++;
            }

            values[value - 1] = true;
        }

        int []  absentStudentIds = new int[n - count];

        int targetVal = 0;

        for (int i = 0; i < n; i++) {

            if (!values[i]){
                absentStudentIds[targetVal] = i + 1;
                targetVal++;
            }
        }

        return  absentStudentIds;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = findTheAbsentStudents(n, a);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
