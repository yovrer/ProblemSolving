
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
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
public class ArrayCount {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokn.nextToken());
        Tree d = new Tree(n);
        for (int i = 0; i < n-1; i++) {
            tokn = new StringTokenizer(input.readLine());
            d.addTree1(Integer.parseInt(tokn.nextToken()), Integer.parseInt(tokn.nextToken()));
        }
        for (int i = 0; i < n-1; i++) {
            tokn = new StringTokenizer(input.readLine());
            d.addTree2(Integer.parseInt(tokn.nextToken()), Integer.parseInt(tokn.nextToken()));
        }
        System.out.println(d.getCycleCount());
    }

    static class Tree {

        HashMap<Integer, Set<Integer>> tree1;
        HashMap<Integer, Set<Integer>> tree2;
        int n;

        public Tree(int n) {
            this.n = n;
            tree1 = new HashMap<>();
            tree2 = new HashMap<>();
            inilize();
        }

        void inilize() {
            for (int i = 1; i <= n; i++) {
                tree1.put(i, new HashSet<>());
                tree2.put(i, new HashSet<>());
            }
        }

        public void addTree1(int fromNode, int toNode) {
            tree1.get(fromNode).add(toNode);
            tree1.get(toNode).add(fromNode);
        }

        public void addTree2(int fromNode, int toNode) {
            tree2.get(fromNode).add(toNode);
            tree2.get(toNode).add(fromNode);
        }
        
        public long  getCycleCount(){
            int sum = 0;
            Set<Integer> ed1 ;
            Set<Integer> ed2 ;
            for (int i = 1; i <= n; i++) {
                ed1 = tree1.get(i);
                ed2 = tree2.get(i);
                for (Integer integer : ed1) {
                    if (ed2.contains(integer)) {
                        sum++;
                        tree1.get(integer).remove(i);
                        tree2.get(integer).remove(i);
                    }
                }
            }
            return  sum;
        
        }

    }
}
