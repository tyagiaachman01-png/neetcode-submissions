class Solution {
    public int lengthOfLongestSubstring(String s) {
        String xd = "";
        int length=0;
        for(int i =0;i<s.length();i++){
            if(xd.indexOf(s.charAt(i))==-1){
                Character c = s.charAt(i);
                xd += (c).toString();
                length = Math.max(length,xd.length());

            }
            else{
                Character f = s.charAt(i);
                int j = xd.indexOf(f);
                xd =  xd.substring(j+1);
                xd += f.toString();
            }

        }
        return length;
        
        
    }
}
