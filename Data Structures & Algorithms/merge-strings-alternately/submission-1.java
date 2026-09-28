class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int length=0;
        if(word1.length()> word2.length()){
        length =word2.length();
        }
        else{
        length= word1.length();
        }
        for (int i =0 ;i< length; i++){
        ans = ans+ word1.charAt(i) + word2.charAt(i);
        }
        if(word1.length()> word2.length()){
        ans = ans + word1.substring(length);
        }
        else{
            ans = ans + word2.substring(length);
        }
        return ans;
    }
}