package Video_questions.DS.Graphs.TraversalTechniques;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
            // Function to perform DFS recursively
            static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
                visited[node] = true; // Mark current node as visited
                System.out.print(node + " "); // Process the node

                // Traverse all adjacent vertices using for loop
                for (int neighbor : adj.get(node)) {
                    if (!visited[neighbor]) {
                        dfs(neighbor, visited, adj);
                    }
                }
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                try {
                    System.out.print("Enter number of vertices: ");
                    int vertices = sc.nextInt();
                    if (vertices <= 0) {
                        System.out.println("Number of vertices must be positive.");
                        return;
                    }

                    System.out.print("Enter number of edges: ");
                    int edges = sc.nextInt();
                    if (edges < 0) {
                        System.out.println("Number of edges cannot be negative.");
                        return;
                    }

                    // Create adjacency list
                    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
                    for (int i = 0; i < vertices; i++) {
                        adj.add(new ArrayList<>());
                    }

                    // Input edges
                    System.out.println("Enter edges (u v) for undirected graph:");
                    for (int i = 0; i < edges; i++) {
                        int u = sc.nextInt();
                        int v = sc.nextInt();

                        // Validate vertices
                        if (u < 0 || u >= vertices || v < 0 || v >= vertices) {
                            System.out.println("Invalid edge: vertices must be between 0 and " + (vertices - 1));
                            i--; // retry this edge
                            continue;
                        }

                        adj.get(u).add(v);
                        adj.get(v).add(u); // For undirected graph
                    }

                    boolean[] visited = new boolean[vertices];

                    System.out.println("DFS Traversal:");
                    // Handle disconnected graphs
                    for (int i = 0; i < vertices; i++) {
                        if (!visited[i]) {
                            dfs(i, visited, adj);
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter integers only.");
                } finally {
                    sc.close();
                }
            }
        }
