import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Codeforce975A {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        HashSet<String> words =new HashSet<>();
        HashSet<Character> d = new HashSet<>();
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            String word = tokn.nextToken();
            StringBuilder newWord = new StringBuilder();
            for (Character c: word.toCharArray()) {
                if (d.add(c)){
                    newWord.append(c);
                }
            }
            words.add(sortString(newWord.toString()));
        }
        System.out.println(words.size());
    }

    public static String sortString(String inputString)
    {
        // convert input string to Character array
        Character tempArray[] = new Character[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }


        // Sort, ignoring case during sorting
        Arrays.sort(tempArray, new Comparator<Character>(){

            @Override
            public int compare(Character c1, Character c2)
            {
                // ignoring case
                return Character.compare(Character.toLowerCase(c1),
                        Character.toLowerCase(c2));
            }
        });

        // using StringBuilder to convert Character array to String
        StringBuilder sb = new StringBuilder(tempArray.length);
        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }
}
