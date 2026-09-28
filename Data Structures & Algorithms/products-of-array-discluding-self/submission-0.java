class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightprods = new int[nums.length];
        int rightprod=1;
        for(int i=nums.length-1;i>=0;i--){
          rightprods[i]= rightprod;
          rightprod *= nums[i];
        }
        int leftprod=1;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]= leftprod*rightprods[i];
            leftprod*= nums[i];
        }
        return ans;
    }
}  
