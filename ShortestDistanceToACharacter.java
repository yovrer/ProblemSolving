import java.util.ArrayList;
import java.util.Collections;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {

        ArrayList<Integer> letterPosition = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C){
                letterPosition.add(i);
            }

        }
        int [] positions = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int position = (Collections.binarySearch(letterPosition, i) * -1) - 1;
            if (position <= - 1){
                positions[i] = 0;
            }else{
                if (position >= letterPosition.size())
                    position = letterPosition.size() - 1;
                if (position == 0) {
                    positions[i] = Math.abs(letterPosition.get(position) - i);
                }else{
                    positions[i] = Math.min(Math.abs(letterPosition.get(position) - i), Math.abs(letterPosition.get(position - 1) - i));
                }

            }
        }
        return positions;
    }

    public int binarySearch(ArrayList<Integer> letterPosition, int index){

        int targetPosition = 0;

        return targetPosition;
    }

    public static void main(String[] args) {
        for (int c:new ShortestDistanceToACharacter().shortestToChar("abba", 'b')
             ) {
            System.out.println(c);
        }
    }
}
