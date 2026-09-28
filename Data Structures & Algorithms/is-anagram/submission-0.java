class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
          int [] s1 = new int[26];
          int [] s2= new int[26];

          for(int i =0 ;i<s.length();i++){
         Character x = s.charAt(i);
         Character y = t.charAt(i);

         (s1[x-'a'])++;
         (s2[y-'a'])++;

          }
          for(int a =0;a<s1.length;a++){
            if(s1[a]!=s2[a]){
                return false;
            }
          }
          return true;
          
    }
}
