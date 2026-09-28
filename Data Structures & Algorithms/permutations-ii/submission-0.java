class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[0]);
            ans.add(temp);
            return ans;
        }

        List<List<Integer>> perms =
            permuteUnique(Arrays.copyOfRange(nums, 1, nums.length));

        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> perm : perms) {
            for (int i = 0; i <= perm.size(); i++) {
                List<Integer> pcopy = new ArrayList<>(perm);
                pcopy.add(i, nums[0]);

                if (!result.contains(pcopy)) {
                    result.add(pcopy);
                }
            }
        }

        return result;
    }
}