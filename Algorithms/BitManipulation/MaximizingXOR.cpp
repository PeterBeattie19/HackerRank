#include <bits/stdc++.h>

using namespace std;

int maximizingXor(int l, int r) {
    // Complete this function
    int max = -10000;
    
    for(int i = l; i<=r; i++){
        for(int j = i; j<=r; j++){
            int a = i^j;
            if(max < a)
                max = a;
        }
    }
    return max; 
     
}

int main() {
    int l;
    cin >> l;
    int r;
    cin >> r;
    int result = maximizingXor(l, r);
    cout << result << endl;
    return 0;
}
