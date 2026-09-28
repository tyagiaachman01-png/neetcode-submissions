class Solution {
    private boolean cococan(int[]pile,int h,int mid){
        int totaltime=0;
          for(int x : pile){
   
        totaltime += (x+mid-1)/mid;
        
          }
          if (totaltime<=h){
               return true;
          }
          else{
            return false;
          }
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right =1000000000;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(cococan( piles ,h,mid)){
                    right=mid-1;
            }
            else{
                left= mid+1;
            }
        }
        return left;
    }
}
