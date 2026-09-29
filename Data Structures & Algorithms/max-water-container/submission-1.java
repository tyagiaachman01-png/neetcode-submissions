class Solution {
    public int maxArea(int[] heights) {
        int startindex=0;
        int endindex= heights.length-1;
        int maxarea=0;
        while(startindex<endindex){
            int height= Math.min(heights[startindex],heights[endindex]);
            maxarea= Math.max(maxarea,height*(endindex-startindex));
if(heights[startindex]>heights[endindex]){
                endindex--;
            }
            else{
                startindex++;
            }
            }
            
            
        
        return maxarea;
    }
}
