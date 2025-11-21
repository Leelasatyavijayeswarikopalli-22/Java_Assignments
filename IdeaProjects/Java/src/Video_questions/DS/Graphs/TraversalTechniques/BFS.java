package Video_questions.DS.Graphs.TraversalTechniques;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> bfsGraph(int v,ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q;
        q = new LinkedList<>();
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[v];
        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()) {
            Integer node=q.poll();
            bfs.add(node);
            for (Integer it:adj.get(node)){
                if(!vis[it]){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
//Disconnected graph Has components
//To ensure the traversal through all of the vertices we add an extra forLoop at the outside
//import java.util.*;
//
//public class GraphBFS {
//    // BFS traversal for possibly disconnected graphs
//    public static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj) {
//        ArrayList<Integer> bfs = new ArrayList<>();
//
//        // Validate inputs
//        if (v <= 0 || adj == null || adj.size() != v) {
//            throw new IllegalArgumentException("Invalid graph input");
//        }
//
//        boolean[] vis = new boolean[v];
//        Queue<Integer> q = new LinkedList<>();
//
//        // Loop through all vertices to handle disconnected graphs
//        for (int start = 0; start < v; start++) {
//            if (!vis[start]) {
//                q.add(start);
//                vis[start] = true;
//
//                while (!q.isEmpty()) {
//                    int node = q.poll();
//                    bfs.add(node);
//
//                    for (Integer neighbor : adj.get(node)) {
//                        if (!vis[neighbor]) {
//                            vis[neighbor] = true;
//                            q.add(neighbor);
//                        }
//                    }
//                }
//            }
//        }
//        return bfs;
//    }
//
//    // Example usage
//    public static void main(String[] args) {
//        int v = 5;
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
//
//        // Example edges (undirected graph)
//        adj.get(0).add(1);
//        adj.get(1).add(0);
//        adj.get(1).add(2);
//        adj.get(2).add(1);
//        adj.get(3).add(4);
//        adj.get(4).add(3);
//
//        System.out.println("BFS Traversal: " + bfsGraph(v, adj));
//    }
//}
//
