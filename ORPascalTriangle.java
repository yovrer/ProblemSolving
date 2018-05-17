import java.util.ArrayList;
import java.util.List;

public class ORPascalTriangle {

    public int solution(boolean[] P) {
        List<Boolean> out = new ArrayList<>();
        for (boolean s: P) {
            out.add(s);
        }
        int count = 0;
        while (!out.isEmpty()){

            if (out.get(0))
                count++;
            ArrayList<Boolean> newOut = new ArrayList<>();
            for (int i = 1; i < out.size(); i++) {
                if (out.get(i))
                    count++;
                if (out.get(i) || out.get(i + - 1)){
                    newOut.add(true);
                }else{
                    newOut.add(false);
                }

            }
            out = newOut;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new ORPascalTriangle().solution(new boolean[]{true, false, false, true}));
    }
}
