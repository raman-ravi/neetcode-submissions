class Solution {
    public boolean isValid(String s) {

        char[] ch = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char c:ch){

            switch(c){

                case '[': stack.push(c); break;
                case '{': stack.push(c); break;
                case '(': stack.push(c); break;

                case ']': 
                if(stack.isEmpty() || stack.pop()!='[')
                    return false;
                break;
                

                case '}': 
                if(stack.isEmpty() || stack.pop()!='{')
                    return false;
                break;

                case ')': 
                if(stack.isEmpty() || stack.pop()!='(')
                    return false;
                break;
                
            }
        }

        return stack.isEmpty();
        
    }
}
