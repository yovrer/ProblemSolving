import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int start = 0;
        int end = people.length - 1;
        Arrays.sort(people);

        while (start <= end) {

            if (people[end] > limit) {
                count++;
                end--;
            } else if (people[end] + people[start] <= limit) {
                count++;
                end--;
            }
        }
        return count;
    }
}
