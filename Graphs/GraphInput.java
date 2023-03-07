package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //graph input given in a two d arrray
        //we can store that in 2 ways;
        //1.storing in matrix;
        int E =sc.nextInt(); // total nodes
        int u;
        int v;
        int[][] arr = new int[5][5];
        //taking input for undirected graph
        for(int i=0;i<E;i++){
            u = sc.nextInt();//take input u
           v = sc.nextInt(); //take input v
            arr[u][v] = 1;
            arr[v][u] = 1;
        }
        //taking input for directed graph
        for (int i = 0; i < E; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            arr[u][v] =1;
        }
        //2.storing in adjacent lists
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(E);
        for (int i = 0; i < E; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            add(adj,u,v);
        }
        //taking input for directed graph
        for (int i = 0; i < E; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            addDirected(adj,u,v);
        }
    }
    public static void add(ArrayList<ArrayList<Integer>> adj , int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void addDirected(ArrayList<ArrayList<Integer>> adj , int u,int v){
        adj.get(u).add(v);
    }
}
