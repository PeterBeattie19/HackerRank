#include <bits/stdc++.h>
#define rep(i,a,b) for(int i = a; i<b; i++)

using namespace std;

int arr[11][11];
bool visited[11][11]; 


void dfs(int i, int j, int m, int n, int& count){
	
	if(i < 0 || j < 0 || i >= n || j>=m || arr[i][j]==0 || visited[i][j]==true)
        return; 
	 
    //cout << i <<" "<<  j << endl;
    count++; 
	visited[i][j] = true; 

	dfs(i+1,j,m,n,count);
	dfs(i,j+1,m,n,count); 
    
	dfs(i-1,j,m,n,count); 
	dfs(i,j-1,m,n,count); 
    
    dfs(i-1,j-1,m,n,count); 
    dfs(i+1,j+1,m,n,count); 
    
     dfs(i-1,j+1,m,n,count); 
     dfs(i+1,j-1,m,n,count); 
}


int main() {
    int i,j,n,m;
    int count = 0;
    int max = 0; 
    cin >> n >> m;
    
    rep(i, 0, n){
        rep(j,0,m){
            cin >> arr[i][j]; 
            
        }
    }
    
	for(int x = 0; x<n; x++){
		for(int y = 0; y<m; y++){
			if(arr[x][y] == 1 && visited[x][y]==false){
			 //cout << count << endl;
				count = 0;  
				dfs(x,y,m,n,count); 
                
                if(count > max)
                    max = count; 
			}
		}
	}
    
    
    cout << max << endl;
    return 0;
}
