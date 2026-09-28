class NumMatrix {
    int[][] nums = new int[201][201];
    public NumMatrix(int[][] matrix) {
        int rows =matrix.length ;
        int columns = matrix[0].length; 
        for(int i = 0; i <rows; i++){
            int prefix =0; // for every row the prefix is initialized zero and then incresed
            for(int j =0;j < columns;j++){
                prefix += matrix[i][j];
                int above = this.nums[i][j+1];
                this.nums[i+1][j+1] = prefix + above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;
        System.out.println("hello");
        int bottomRight = this.nums[row2][col2];
        int above =  this.nums[row1-1][col2];
        int left = this.nums[row2][col1-1];
        int topLeft= this.nums[row1-1][col1-1];
        int answer = bottomRight - above - left + topLeft;
        return answer;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */