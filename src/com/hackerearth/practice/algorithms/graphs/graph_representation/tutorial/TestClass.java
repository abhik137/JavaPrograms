package com.hackerearth.practice.algorithms.graphs.graph_representation.tutorial;
/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] line1 = line.split(" ");
        int N = Integer.parseInt(line1[0]);
        int M = Integer.parseInt(line1[1]);
        
        int[] vertices = new int[N];
        //List<List<Integer>> adjList = new ArrayList<LinkedList<Integer>>(); //This is not allowed in java
        ArrayList<Integer>[] adj = new ArrayList[N];    //BUT, this is allowed?
        List<LinkedList<Integer>> adjList = new ArrayList<LinkedList<Integer>>();
        for(int i=0; i<N; i++) {
            adjList.add(new LinkedList<Integer>());
        }
        for(int i=0; i<M; i++) {
            line = br.readLine();
            String[] line2 = line.split(" ");
            //TODO: This is not very clean, should have a node class with key
            int A = Integer.parseInt(line2[0]) - 1;
            int B = Integer.parseInt(line2[1]) - 1;
            
            //Add B to A's list
            adjList.get(A).add(B);
            //Add A to B's list
            adjList.get(B).add(A);
        }
        line = br.readLine();
        int Q = Integer.parseInt(line);
        for(int i=0; i<Q; i++) {
            line = br.readLine();
            String[] line3 = line.split(" ");
            int A = Integer.parseInt(line3[0]) - 1;
            int B = Integer.parseInt(line3[1]) - 1;
            boolean answer = isEdgePresent(adjList.get(A), A, B);
            if(answer)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    private static boolean isEdgePresent(LinkedList<Integer> list, int A, int B) {
        if(A == B)  //For self-Loop
            return true;
        return list.contains(B);
    }
}
