class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target =0;
        List<List<Integer>> l1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int start = i+1;
            int end = nums.length-1;
            
            while(start<end){
                int sum = nums[i]+ nums[start]+nums[end];
            if(sum<target){
                start++;
            }
            else if(sum>target){
                end--;

            }
            else{
                List <Integer> xd = new ArrayList<>();

                xd.add(nums[i]);
                xd.add(nums[start]);
                xd.add(nums[end]);
                l1.add(xd);
                start++;
                end--;
                while(start<end && nums[start-1]==nums[start]) start++;
                while(start<end && nums[end]==nums[end+1]) end--;
               
            }
            }
        
        }
        return l1;}

}
