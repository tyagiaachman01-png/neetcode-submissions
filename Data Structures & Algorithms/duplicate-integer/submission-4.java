class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        for(int i: nums){
            s1.add(i);
        }
        return !(s1.size()==nums.length);
    }
}