class Solution {
   HashMap<String,List<String>> h1 = new HashMap<>();
    private String generatekey(String s){
          Integer[] count = new Integer[26];
          String key ="";
          for(int x =0;x<26;x++){
            count[x]=0;
          }
          for(int i =0;i<s.length();i++){
            Character xd = s.charAt(i);
            count[xd-'a']++;

          }
          for(int i =0;i<26;i++){
             key += count[i].toString()+"#";
          }
          return key;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        for(int i=0;i<strs.length;i++){
                 String key = generatekey(strs[i]);
                 if(h1.containsKey(key)){
                    List<String>k1 = h1.get(key);
                      k1.add(strs[i]);
                      h1.put(key,k1);
                 }
                 else{
                    List<String> l1 = new ArrayList<>();
                    l1.add(strs[i]);
                    h1.put(key,l1);
                 }

        }
        return new ArrayList<>(h1.values());
    }
}
