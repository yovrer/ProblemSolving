
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Contest913B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Tree tree = new Tree(n);
        for (int i = 2; i <= n; i++) {
            tree.add(input.nextInt(), i);
        }
        System.out.println(tree.bfs(1)?"Yes":"No");
    }
}


class Tree {
    Node [] nodes;

    public Tree(int n) {
        nodes = new Node[n+1];
        init();
    }
    
    public void init(){
        for (int i = 1; i < nodes.length; i++) {
            nodes[i] = new Node(i);
        }
    }
    
    public void add(int index,int edge){
        nodes[index].edge.add(edge);
    }
    
    public boolean bfs (int root){
        
        Queue<Integer> data = new LinkedList<>();
        data.add(root);
        
        while (!data.isEmpty()) {
            
            int x  =  data.poll();
            
            int size = nodes[x].edge.size();
            
            for (Integer object : nodes[x].edge) {
                if (!nodes[object].edge.isEmpty()) {
                    size--;
                }
                data.add(object);
            }
            if (size < 3 && nodes[x].edge.size()!= 0) {
                return false;
            }
        }
        
    
        return true;
    }
}


class Node {
    int value;
    ArrayList<Integer> edge;

    public Node(int value) {
        this.value = value;
        this.edge = new ArrayList<>();
    }
    
}
