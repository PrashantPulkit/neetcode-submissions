class Solution {
    int[] visiting;
    ArrayList<Integer> order;
    HashMap<Integer, List<Integer>> hm = new HashMap<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        visiting = new int[numCourses];
        order = new ArrayList<>();
        for(int i= 0; i<numCourses;i++){
            hm.put(i,new ArrayList<>());

        }
        for (int[] p : prerequisites){
            hm.get(p[0]).add(p[1]);
        }
        for(int i = 0; i< numCourses; i++){
           if(!dfs(i)){
            return new int[0];
           }
        }
        int[] ans = new int[order.size()];
for (int i = 0; i < order.size(); i++) {
    ans[i] = order.get(i);
}
return ans;

    }
    private boolean dfs(int c){
    if(visiting[c]==2){
        return true;
    }
    if(visiting[c]==1){
        return false;
    }
    if(hm.get(c).isEmpty()){
     order.add(c);
visiting[c] = 2;
     return true;
    }
    visiting[c]=1;
    for(int i : hm.get(c)){
        if(!dfs(i)){

            return false;
        }
        
    }
    visiting[c]=2;
    order.add(c);
    hm.put(c,new ArrayList<>());
    return true;
    }
}
