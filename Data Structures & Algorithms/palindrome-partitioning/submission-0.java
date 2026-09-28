class Solution {
    List<List<String>> sub = new ArrayList<>();
    String s;

    public List<List<String>> partition(String s) {
        this.s = s;
        dfs(new ArrayList<>(), 0);
        return sub;
    }

    private void dfs(List<String> path, int idx) {
        if (idx == s.length()) {
            sub.add(new ArrayList<>(path)); // copy path
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            String candidate = s.substring(idx, i + 1);
            if (isPalindrome(candidate)) {
                path.add(candidate);
                dfs(path, i + 1);
                path.remove(path.size() - 1); // backtrack
            }
        }
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }
}
