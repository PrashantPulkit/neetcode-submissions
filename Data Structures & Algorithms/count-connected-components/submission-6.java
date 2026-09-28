class Solution {
    public int countComponents(int n, int[][] edges) {
      int[] parent= new int[n];
      for(int i  =0;i<n;i++){
        parent[i]=i;
      }
      for(int[] edge :edges){
        int roota = find(parent,edge[0]);
        int rootb= find(parent,edge[1])   ;
        if(roota != rootb){
            parent[roota] = rootb;
            n--;
        }  
        }
        return n;
    }
     private int find(int[] parent, int x){
        if(parent[x]!= x){
            parent[x]= find (parent, parent[x]);
        }
        
        return parent[x];
     }
}
