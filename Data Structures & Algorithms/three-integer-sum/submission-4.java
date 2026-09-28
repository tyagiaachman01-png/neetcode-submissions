class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        int target =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int left =i+1;
            int right = nums.length-1;
            int fix =nums[i];
            while(left<right){
                    int sum = nums[left]+nums[right]+ fix;
                    if(sum<target){
                        left++;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        int x = nums[left];
                        int y =nums[right];
                        int z = fix;
                        List<Integer> p1 = new ArrayList<>();
                        p1.add(x);
                        p1.add(y);
                        p1.add(z);
                        l1.add(p1);
                        left++;
                        right--;
                        while(left<right &&nums[left]==nums[left-1])left++;
                        while(right>left && nums[right]==nums[right+1]) right--;

                    }
                
            }

            

        }
        return l1;
        }}
    

