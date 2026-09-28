class Solution {
    public int mySqrt(int x) {
        int l = 0, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            long midsq = (long) mid * mid; // use long to avoid overflow
            if (midsq == x) {
                return mid;
            } else if (midsq < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return h; // when loop ends, h is the integer sqrt
    }
}
