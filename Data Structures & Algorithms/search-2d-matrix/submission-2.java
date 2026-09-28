class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1 && matrix[0].length==1){
            if(matrix[0][0]==target){
                return true;
            }
            else{
                return false;
            }
        }
        int left=0;
        int right = matrix.length-1;
        int targetrow =-1;
        while(left<=right){
            int mid = (left + right)/2;
            int rightl = matrix[mid].length-1;

            if(target>matrix[mid][rightl]){
                left=mid+1;
            }
            else if(target<matrix[mid][0]){
                   right=mid-1;
            }
            else{
                targetrow=mid;
                break;

            }

            
           

        }
        if(targetrow==-1){return false;}
        left=0;
        right= matrix[targetrow].length-1;
        int mid =targetrow;
        while(left<=right){
            int middle= (left+right)/2;
            if(matrix[mid][middle]>target){
                right= middle-1;
            }
            else if(matrix[mid][middle]<target){
                left = middle+1;

            }
            else{
                return true;
            }
        }
        return false;
    }
}
