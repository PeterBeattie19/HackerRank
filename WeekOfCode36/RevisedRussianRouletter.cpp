vector <int> revisedRussianRoulette(vector <int> doors) {
    // Complete this function
    int count = 0;
    int sum = 0; 
    for(int i = 0; i<doors.size(); i++){
        if(i == doors.size() - 1){
            if(doors[i] == 1){
                count += 1;
                sum += 1;
            }
        }
        
        else if(doors[i] == 1 && doors[i+1] == 1){
            count += 2;
            sum += 1; 
            doors[i] = 0;
            doors[i+1] = 0; 
            i += 1;
        }
        
        else if(doors[i] == 1 && doors[i] == 0){
            count += 1;
            sum += 1;
        }
    }
    
    cout << sum << " " << count;
    return vector<int> (sum, count); 
}
