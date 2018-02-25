import java.util.*; 
import java.io.*; 

public class AllPairsShortestPath {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String line[] = br.readLine().split(" "); 

		int n = Integer.parseInt(line[0])+1; 
		int m = Integer.parseInt(line[1]);

		
			double dist[][] = new double[n][n]; //Only doubles have positive and negative infinty 

			for(int i = 0; i<n; i++){
				for(int j = 0; j<n; j++){
					if(i == j)
						dist[i][j] = 0.0;
					else
						dist[i][j] = Double.POSITIVE_INFINITY; 
				}
			}

			for(int i = 0; i<m; i++){
				line = br.readLine().split(" "); 
				int u = Integer.parseInt(line[0]);
				int v = Integer.parseInt(line[1]);
				int w = Integer.parseInt(line[2]);

				
				dist[u][v] = (double)Math.min(w, dist[u][v]); //if an edge exits the entry will != 0 and the value will the weight of the edge, easier than using Edge class 
			}

			floydWarshall(dist);
			int q = Integer.parseInt(br.readLine()); 

			for(int i = 0; i<q; i++){
				line = br.readLine().split(" "); 

				int u = Integer.parseInt(line[0]);
				int v = Integer.parseInt(line[1]);

				if(dist[u][v] == Double.POSITIVE_INFINITY)
					System.out.println("-1"); //No path

				else if(dist[u][v] == Double.NEGATIVE_INFINITY)
					System.out.println("-1"); //Negative Cycle 

				else
					System.out.println((int)dist[u][v]); 
			}
			
		
	}

	public static void floydWarshall(double dist[][]){
        for (int i = 0; i < dist.length; i++){
            for (int j = 0; j < dist.length; j++){
                for (int k = 0; k < dist.length; k++){
                    if(dist[j][i] + dist[i][k] < dist[j][k]) //This is why we use Double.POSITIVE_INFINITY just parse on output
                    	dist[j][k] = dist[j][i] + dist[i][k]; 
                }
            }
        }

        for (int i = 0; i < dist.length; i++){
            for (int j = 0; j < dist.length; j++){
                for (int k = 0; k < dist.length; k++){

                    if(dist[j][i] + dist[i][k] < dist[j][k]) //Negstive Cycle 
                    	dist[j][k] = Double.NEGATIVE_INFINITY; 
                }
            }
        }   
	}
} 
