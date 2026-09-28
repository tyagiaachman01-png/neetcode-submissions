class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int first=0 ;
        int second=0;
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(target-nums[i])){
                first= h1.get(target-nums[i]);
                second= i;
                break;
                 
            }
            else{
                h1.put(nums[i],i);
            }
        }
        int[] arr= {first,second};
        return arr;
    }
}
