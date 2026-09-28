class Solution {
    int[] candidates;
    int target;
    List<List<Integer>> sub = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        this.target= target;
        this.candidates= candidates;
        add(new ArrayList<>(),0,0);
        return sub;
    }
     private void add(List<Integer> path, int idx, int sum){
        if(sum==target){
            sub.add(new ArrayList<>(path));
            return;
        }
        if(idx==candidates.length){
            return;
        }
        else if(sum<target){
            path.add(candidates[idx]);
            add(path,idx+1,sum+candidates[idx]);
            path.remove(path.size()-1);
            
            int i = idx + 1;
while (i < candidates.length && candidates[i] == candidates[idx]) {
    i++;
}
            add(path,i,sum);
            
        }else{
            return;
        }
    }
}
