class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(target-nums[i])){
                int[] ans ={h1.get(target-nums[i]),i};
                return ans;
            }
            else{h1.put(nums[i],i);}
        }
        int[] n1 = {-1,-1};
        return n1;
    }
}
