/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class ContestGenerateMy {
    public static void main(String[] args) {
        String []  metric =  {"ft", "dn", "sfa", "rc", "rv", "rs"};
        
//        for (int i = 0; i < metric.length; i++) {
//            System.out.println(String.format("\"%s\" :{\"$sum\":\"$%s\"}", metric[i], metric[i]));
//            System.out.println(String.format("\"%s\" :{\"$sum\":\"$%s\"}", metric[i]+"vid", metric[i]+"vid"));
//        }
        for (int i = 0; i < metric.length; i++) {
            System.out.println();
            System.out.println(String.format("contentGroup.put(\"%s\", new Document(\"$sum\",\"$%s\"));", metric[i], metric[i]));
            System.out.println();
            System.out.println(String.format("contentGroup.put(\"%s\", new Document(\"$sum\",\"$%s\"));", metric[i]+"vid", metric[i]+"vid"));
        }


    }
}
