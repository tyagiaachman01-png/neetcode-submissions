class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> h1 = new HashMap<>();
        h1.put('}','{');
        h1.put(']','[');
        h1.put(')','(');
        Stack <Character> s1 = new Stack<>();
        
        for(int i =0;i<s.length();i++){
            if(h1.containsKey(s.charAt(i))){
                if(s1.isEmpty()){
                    return false;
                }
                else{
                    if(s1.peek()==h1.get(s.charAt(i))){
                        s1.pop();
                        
                    }
                    else{
                        return false;
                    }

                }
            
            }
            else{
                s1.add(s.charAt(i));
            }
        }
        return s1.isEmpty();
    }
}
