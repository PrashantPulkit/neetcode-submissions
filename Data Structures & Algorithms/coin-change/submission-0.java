
class Solution {
    HashMap<Integer, Integer> hm = new HashMap<>();
    int[] coins;

    public int coinChange(int[] coins, int amount) {
        this.coins = coins;
        int ans = choose(amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int choose(int amount) {
        if (amount == 0) return 0; // base case
        if (amount < 0) return Integer.MAX_VALUE; // invalid path

        if (hm.containsKey(amount)) return hm.get(amount);

        int min = Integer.MAX_VALUE;
        for (int c : coins) {
            int res = choose(amount - c);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, res + 1); // +1 for using coin c
            }
        }

        hm.put(amount, min);
        return min;
    }
}
