import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class MainA {
 
    public static void main(String[] args)throws Exception{
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = Integer.parseInt(input.readLine());
//        StringTokenizer tokn = new StringTokenizer(input.readLine());
//        for (int i = 0; i < n; i++) {
//            int value = Integer.parseInt(tokn.nextToken());
//            map.put(value, map.getOrDefault(value, 0) + 1);
//        }
//        long count = 0;
//        for (Integer value : map.values()) {
// 
//            count += sum(value-1);
//            
//        }
//        System.out.println(count);

    String h = "UDLR";
    int count =0;
        for (int i = 0; i < h.length(); i++) {
            for (int j = 0; j < h.length(); j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k <h.length(); k++) {
                    if (j==k || k== i) {
                        continue;
                    }
                    for (int l = 0; l < h.length(); l++) {
                        if (l==k || l==j || l== i) {
                            continue;
                        }
                        count++;
                        System.out.println(h.charAt(i)+""+h.charAt(j)+""+h.charAt(k)+""+h.charAt(l));
                    }
                }
            }
        }
        System.out.println(count);
System.out.println(Integer.toString(1111, 2));
    }
    public static long sum (int n ){
     return n*(n+1L)/2L;
    }
}
//15
//12
//1 4 4 4 4 4 9 9 9 5 1 2
//5
//4 4 4 4 4
//0001 
//0010
//0100