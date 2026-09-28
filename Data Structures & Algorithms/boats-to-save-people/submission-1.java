class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r =people.length-1;
        int boats = 0;
        while(l<r){
            if(people[l]+people[r]>limit){
                r--;
                boats++;
                if(l==r){
                    boats+=1;
                }
            }
            else{
                r--;
                l++;
                boats+=1;
                if(l==r){
                    boats+=1;
                }
            }
        }
        return boats;
    }
}