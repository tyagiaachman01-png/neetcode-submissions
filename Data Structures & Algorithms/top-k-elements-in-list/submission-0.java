class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> h1 = new HashMap<>();

      PriorityQueue<Integer> p1 = new PriorityQueue<>((a, b)->h1.get(a)-h1.get(b));
      for(int i =0;i<nums.length;i++){
        if(h1.containsKey(nums[i])){
            h1.put(nums[i],(h1.get(nums[i]))+1);
        }
        else{
            h1.put(nums[i],1);
        }

      }
      for(int x : h1.keySet()){
        p1.add(x);
        if(p1.size()>k){
            p1.poll();
        }

      }
      int [] ans = new int[k];
      for(int i=0;i<k;i++){
            ans[i]=p1.poll();
      }
      return ans;
    }
}
