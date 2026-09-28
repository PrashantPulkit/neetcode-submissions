class Solution {
    int[] visiting;
    HashMap<Integer,List<Integer>> hm = new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visiting = new int[numCourses];
        for(int i =0 ;i<numCourses;i++){
            hm.put(i,new ArrayList<>());
        }
        for(int[] p : prerequisites){
            hm.get(p[0]).add(p[1]);
        }
        for(int i =0 ;i<numCourses;i++){
            if(!dfs(i)){
                return false;
            }
        }

        return true;
    }
    private boolean dfs(int c){
        if(visiting[c]==1){
            return false;
        }
        if(hm.get(c).isEmpty()){
            return true;
        }

        visiting[c]=1;
        for(int p:hm.get(c)){
            if(!dfs(p)){
                return false;
            }
        }
        visiting[c]=0;
        hm.put(c,new ArrayList<>());
        return true;
        
    }
}
