class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],(h1.get(nums[i]))+1);
            }
            else{
                h1.put(nums[i],1);
            }

        }
        int countmax=0;
        for(int key: h1.keySet()){
            if(h1.containsKey(key-1)){
            
            }
            else{
                int localcount=1;
                int countit=1;
                while(h1.containsKey(key+countit)){

                    localcount++;
                    countit++;
                   
                }
                countmax = Math.max(localcount,countmax);
                
            }
            
        };

        return countmax;
    }
}
