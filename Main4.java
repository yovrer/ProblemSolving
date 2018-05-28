///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.paintthefence;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.HashSet;
//import java.util.StringTokenizer;
//
///**
// *
// * @author rn-sshawish
// */
//public class Main4 {
//    public static void main(String[] args) {
//        MyScanner input = new MyScanner(System.in);
//        int n = input.nextInt();
//        int [] data = new int[n];
//        HashSet<Integer> allSum = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            data[i] = input.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (i != j) {
//                    allSum.add(data[i]+data[j]);
//                }
//            }
//        }
//        System.out.println(allSum.size());
//    }
//}
//
//
////class MyScanner {
////
////    public BufferedReader reader;
////    public StringTokenizer tokenizer;
////
////    public MyScanner(InputStream stream) {
////        reader = new BufferedReader(new InputStreamReader(stream), 32768);
////        tokenizer = null;
////    }
////
////    public String next() {
////        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
////            try {
////                tokenizer = new StringTokenizer(reader.readLine());
////            } catch (IOException e) {
////                throw new RuntimeException(e);
////            }
////        }
////        return tokenizer.nextToken();
////    }
////
////    public int nextInt() {
////        return Integer.parseInt(next());
////    }
////
////}
