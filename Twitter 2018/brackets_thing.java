public static boolean isBalanced(String expression) {
    char openings[] = {'{' , '(' , '['}; 
    char closings[] = {'}' , ')' , ']'}; 
    
    Stack<Character> s = new Stack<Character>(); 
    
    for(char c: expression.toCharArray()){
        if(inArr(c,openings)==true){
            s.push(c); 
             
        }
        
        else {
            if(s.isEmpty() || isClosing(s.pop(),c)==false) return false; 
        }

    }
    
    return s.isEmpty(); 
}

public static boolean inArr(char c, char arr[]){
    for(char s: arr) if(s==c) return true; 
    
    return false; 
}

public static boolean isClosing(char c1, char c2){
    if(c1=='{' && c2=='}') return true; 
    
    else if(c1=='(' && c2==')') return true; 
    
    else if(c1=='[' && c2==']') return true; 
    
    return false; 
}