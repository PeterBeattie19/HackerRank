import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
       // Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int t = Integer.parseInt(br.readLine()); 
        for(int a0 = 0; a0 < t; a0++){
            String line[] = br.readLine().split(" "); 
            int n = Integer.parseInt(line[0]); 
            int m = Integer.parseInt(line[1]);
            
            ArrayList<LinkedList<Integer>> graph = new ArrayList<>();
            
            for(int i = 0; i<n; i++)
			    graph.add(new LinkedList<>());
            
            int weight[][] = new int[n][n]; 
            for(int a1 = 0; a1 < m; a1++){
                 line = br.readLine().split(" "); 
                
                int x = Integer.parseInt(line[0])-1;
                int y = Integer.parseInt(line[1])-1;
                int r = Integer.parseInt(line[2]);
                
                graph.get(x).add(y); 
                graph.get(y).add(x);
                
                if(weight[x][y] > r || weight[x][y] == 0){
                weight[x][y] = r;
                weight[y][x] = r; 
                }
            }
            int s = Integer.parseInt(br.readLine())-1;
            int dist[] = new int[n]; 
            calculate(graph, s, dist, weight); 
            
            for(int i = 0; i<n; i++){
                if(i == s)
                    continue;
                if(dist[i] == Integer.MAX_VALUE)
                    System.out.print("-1 "); 
                else
                    System.out.print(dist[i] +" "); 
            }
            System.out.println(); 
        }
    }
    
	public static void calculate(ArrayList<LinkedList<Integer>> g, int source, int dist[], int w[][]){
		// Algo:
		// 1. Take the unvisited node with minimum weight.
		// 2. Visit all its neighbours.
		// 3. Update the distances for all the neighbours (In the Priority Queue).
		// Repeat the process till all the connected nodes are visited.
		
        for(int i = 0; i<g.size(); i++)
            dist[i] = Integer.MAX_VALUE; 
		//source.dist = 0;
		dist[source] = 0; 
		PriorityQueue<Integer> queue = new PriorityQueue<>();  


		queue.add(source);
		
		while(!queue.isEmpty()){
			
			int u = queue.poll();
		
			for(int neighbour: g.get(u)){
				int newDist = dist[u] + w[neighbour][u];
				
				if( dist[neighbour] > newDist){
					// Remove the node from the queue to update the distance value.
					queue.remove(neighbour);
					//neighbour.destination.dist = newDist;
					dist[neighbour] = newDist; 
					
					// Take the path visited till now and add the new node.s
					//neighbour.destination.path = new LinkedList<Vertex>(u.path);
					//neighbour.target.path.add(u);
					
					//Reenter the node with new distance.
					queue.add(neighbour); 					
				}
			}
		}
	}
}
