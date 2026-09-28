class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<Character>();
        HashMap<Character,Character> brac = new HashMap<>();
        brac.put('}','{');
        brac.put(')','(');
        brac.put(']','[');
        for(char c:s.toCharArray()){
            if(brac.containsKey(c)){
            if(!open.isEmpty() && brac.get(c).equals(open.peek()) ){
               open.pop();
            }else{
                return false;
            }
            }else{
                open.push(c);
            }
        }
        return open.isEmpty() && true;
    }
}
