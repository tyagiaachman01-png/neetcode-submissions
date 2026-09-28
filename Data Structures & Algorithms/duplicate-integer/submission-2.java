class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
      HashMap<Integer,Integer> h1 = new HashMap<>();
   
        
        for(int i =0;i<nums.length;i++){
        if(h1.containsKey(nums[i])){
            int x = h1.get(nums[i]) +1;
            h1.put(nums[i],x);
            if(x>=2){
                flag = true;
                break;
            }
            
        }
        else{
            h1.put(nums[i],1);
        }
        
        
    }
    return flag;
}}