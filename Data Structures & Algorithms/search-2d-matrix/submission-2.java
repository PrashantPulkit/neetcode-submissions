class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int length = matrix.length;
        int breadth = matrix[0].length;
        int h = (length*breadth)-1;
        int mid =0;
        while(l<=h){
            mid = l+(h-l)/2;
            if(matrix[(mid/breadth)][(mid%breadth)]==target){
                return true;
            }else if (matrix[(mid/breadth)][mid%breadth]>target){
                h = mid-1;
            }else{
                l = mid +1;
            }
        }
        return false;
    }
}
