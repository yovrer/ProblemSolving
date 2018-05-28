
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author rn-sshawish
 */
public class CWHIZZ05 {

    public static void main(String[] args) throws Exception {
            try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int q = Integer.parseInt(input.readLine());
            StringTokenizer tokn;
            StringBuilder out = new StringBuilder();
            
            for (int i = 0; i < q; i++) {
                tokn = new StringTokenizer(input.readLine());
                int n = Integer.parseInt(tokn.nextToken());
                int m = Integer.parseInt(tokn.nextToken());
                HashMap<Integer, Point> points = new HashMap<>();
                for (int j = 0; j < m; j++) {
                    tokn = new StringTokenizer(input.readLine());
                    if (tokn.nextToken().equals("UPDATE")) {
                        
                        Point tar = new Point(
                                Integer.parseInt(tokn.nextToken()), 
                                Integer.parseInt(tokn.nextToken()),
                                Integer.parseInt(tokn.nextToken()),
                                Integer.parseInt(tokn.nextToken()));
                        points.put(tar.value, tar);
                    } else {
                        out.append(getSum(new Point(
                                Integer.parseInt(tokn.nextToken()),
                                Integer.parseInt(tokn.nextToken()),
                                Integer.parseInt(tokn.nextToken())),
                                new Point(
                                        Integer.parseInt(tokn.nextToken()),
                                        Integer.parseInt(tokn.nextToken()),
                                        Integer.parseInt(tokn.nextToken())),
                                points)).append("\n");
                    }
                }
            }
            System.out.print(out);
            }catch(Exception e){
            }
            
    }

    public static boolean check(Point l, Point r, Point p) {
        return p.value >= l.value && p.value <= r.value;
    }

    public static long getSum(Point l, Point r, HashMap<Integer, Point> points) {
        long sum = 0;
        for (Point point : points.values()) {
            if (check(l, r, point)) {
                sum += point.sum;
            }
        }
        return sum;

    }

    static class Point {

        long  sum;
        int value;

        public Point(int x, int y, int z, int sum) {
            this.value = x * 100;
            this.value += y * 10;
            this.value += z;
            this.sum = sum;
        }

        public Point(int x, int y, int z) {
            this.value = x * 100;
            this.value += y * 10;
            this.value += z;
        }
    }

}




