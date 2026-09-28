class Solution {
    public int search(int[] nums, int target) {
       int r = findrotation(nums);
       if (r == -1) r = 0;
       int left = bsearch(0, r - 1, target, nums);
       int right = bsearch(r, nums.length - 1, target, nums);
       if(left == -1){
        return right;
       } else 
       {return left;
       }
    }
private int bsearch(int lb, int ub, int n, int[] nums){
while(lb <= ub){
        int mid = lb + ((ub - lb) / 2);
        if(n == nums[mid]){
            return mid;
        }
        else if(n < nums[mid]){
            ub = mid - 1;
        }
        else {
            lb = mid + 1;
        }
    }
    return -1;
}
private int findrotation(int[] nums){
    int lb = 0;
    int ub = nums.length - 1;
    if(nums.length == 1) return 0;
    if(nums[lb] < nums[ub]){
        return 0;
    }
    else{
        while(lb <= ub){
            int mid = lb + ((ub - lb) / 2);
            if (mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            }
            if (mid < nums.length - 1 && nums[mid+1] < nums[mid]){
                return mid + 1;
            }
            if(nums[lb] > nums[mid]){
                ub = mid - 1;
            }
            else {
                lb = mid + 1;
            }
        }
    }
    return -1;
}
}