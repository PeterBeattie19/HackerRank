if __name__ == '__main__':
    N = int(input())
    arr = [] 
    
    for i in range(0,N):
        s = input().split(" ") 
        
        if "insert" in s[0]:
            pos = int(s[1])
            element = int(s[2])
            arr.insert(pos, element) 
        
        elif "append" in s[0]: 
            e = int(s[1])
            arr.append(e) 
            
        elif "print" in s[0]:
            print(arr) 

        elif "sort" in s[0]:
            arr.sort() 
        elif "reverse" in s[0]:
            arr.reverse() 
        
        elif "pop" in s[0]:
            arr.pop() 
            
        elif "remove" in s[0]:
            arr.remove(int(s[1]))
