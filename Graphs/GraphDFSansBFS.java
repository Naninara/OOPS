package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphDFSansBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E =sc.nextInt(); // total nodes
        int u;
        int v;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(E);
        for (int i = 0; i < E; i++) {
           adj.add(new ArrayList<>());
        }
        //System.out.println(adj);
        for (int i = 0; i < E; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            add(adj,u,v);
        }
        System.out.println(adj);
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[E];
        dfs(0,adj,vis,ans);
        System.out.println(ans);
    }
    public static void add(ArrayList<ArrayList<Integer>> adj , int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, ArrayList<Integer> ans){
        vis[node] = 1;
        ans.add(node);
        for(int ele:adj.get(node)){
            if(vis[ele]==0){
                dfs(ele,adj,vis,ans);
            }
        }
    }

}

