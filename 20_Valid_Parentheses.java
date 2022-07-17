class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c){
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.pop() == '(') {
                        
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.pop() == '{') {
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.pop() == '[') {
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;        
            }
            
        }
        if(stack.isEmpty()) return true;
        
        return false;

    }
}
