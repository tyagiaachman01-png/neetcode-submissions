class Solution {
    public String encode(String s){
     int[] n1 = new int[26];
     for(int i =0;i<s.length();i++){
        n1[s.charAt(i)-'a']++;

     }
     StringBuilder sb = new StringBuilder();
     for(int j=0;j<n1.length;j++){
        sb.append(n1[j]).append("#");
     }
     return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m1 = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String k = encode(strs[i]);
            if(m1.containsKey(k)){
               List<String> sx = m1.get(k);
               sx.add(strs[i]);
               m1.put(k,sx);
            }
            else{
                List<String> g1 = new ArrayList<>();
                g1.add(strs[i]);
                m1.put(k,g1);
            }



        }
         List<List<String>> ans = new ArrayList<>(m1.values());
         return ans;

    }
}
