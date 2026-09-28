class Solution {
    public int trap(int[] height) {
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int max1 =0;
        int max2= 0;
        for(int i=0;i<height.length;i++){
            lmax[i] = max1;
               if(height[i]>max1){
                      max1=height[i];
               }

               
        }
        for(int j = height.length-1;j>0;j--){
             rmax[j]= max2;
             max2 = Math.max(height[j],max2);

        }
        int water=0;
        for(int  i=0;i<height.length;i++){
            int waterl = Math.min(lmax[i],rmax[i]) - height[i];
            water += Math.max(0,waterl);

        }
        return water;

        
    }
}
