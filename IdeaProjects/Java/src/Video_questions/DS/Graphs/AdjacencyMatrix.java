package Video_questions.DS.Graphs.TraversalTechniques;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, e;
        String[] vertices;
        int[][] adj;
        System.out.print("Enter the number of vertices: ");
        n = scanner.nextInt();
        vertices = new String[n];
        adj = new int[n][n];
        System.out.println("Enter the vertices (single letters):");
        for (int i = 0; i < n; i++) {
            vertices[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = 0;
            }
        }
        System.out.print("Enter number of edges: ");
        e = scanner.nextInt();
        System.out.println("Enter edges in the form (u v) meaning u -> v:");
        for (int k = 0; k < e; k++) {
            String uStr = scanner.next();
            String vStr = scanner.next();
            char u = uStr.charAt(0);
            char v = vStr.charAt(0);
            int ui = -1;
            int vi = -1;
            for (int i = 0; i < n; i++) {
                if (vertices[i].charAt(0) == u) {
                    ui = i;
                }
                if (vertices[i].charAt(0) == v) {
                    vi = i;
                }
            }
            if (ui != -1 && vi != -1) {
                adj[ui][vi] = 1;
            } else {
                System.out.println("Error: One or both vertices not found for edge " + u + " -> " + v);
            }
        }
        System.out.println("\nAdjacency Matrix:");
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i].charAt(0) + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i].charAt(0) + " ");
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
