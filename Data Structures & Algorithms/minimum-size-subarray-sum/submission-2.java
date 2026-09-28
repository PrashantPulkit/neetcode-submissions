class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int currentsum = 0;
        int length = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            currentsum += nums[r];

            while (currentsum >= target) {
                length = Math.min(length, r - l + 1);
                currentsum -= nums[l];
                l++;
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
