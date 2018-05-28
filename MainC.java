
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class MainC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Tree tree = new Tree(n);
        for (int i = 0; i < n - 1; i++) {
            tree.addEdge(input.nextInt(), input.nextInt(), input.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            tree.tree.get(i).coust = input.nextInt();
        }
        tree.solution();
    }
    
    static final class Tree {

    HashMap<Integer, Node> tree;
    int n;

    public Tree(int n) {
        this.n = n;
        tree = new HashMap<>();
        createTree(n);
    }

    public void createTree(int n) {
        for (int i = 1; i <= n; i++) {
            tree.put(i, new Node(i, 0, 0));
        }
    }

    public void addEdge(int root, int child, int cost) {
        tree.get(child).EdgeCost = cost;
        tree.get(root).myEdge.add(tree.get(child));
    }

    public void dfs(int m) {
        Queue<Node> stack = new LinkedList<>();
        HashSet<Integer> mySum = new HashSet<>();
        stack.add(tree.get(m));
        while (!stack.isEmpty()) {
            Node currentNode = stack.poll();
            if (m == currentNode.value) {
                mySum.add(currentNode.coust);
            } else {
                mySum.add(currentNode.Copy + currentNode.EdgeCost + currentNode.coust);
            }
            for (Node node : currentNode.myEdge) {
               if (m != currentNode.value) 
                node.Copy =currentNode.Copy + currentNode.EdgeCost;
                stack.add(node);
            }
        }
        System.out.println(mySum.size());
    }

    public void solution() {
        for (int i = 1; i <= n; i++) {
            dfs(i);
            reset ();
        }

    }
    
    public void reset (){
        for (int i = 1; i <= n; i++) {
            tree.get(i).Copy = 0;
        }
    }

}

static class Node {

    int value;
    int coust;
    int Copy;
    int EdgeCost;
    ArrayList<Node> myEdge;

    public Node(int value, int coust, int Copy) {
        this.value = value;
        this.coust = coust;
        this.Copy = Copy;
        myEdge = new ArrayList<>();
    }

}


}

