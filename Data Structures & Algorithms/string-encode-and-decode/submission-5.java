class Solution {

    public String encode(List<String> strs) {
        String s = new String();
        for(String str: strs){
           s =  s + (str+"#_");

        }
        System.out.println(s);
        return s;

    }

    public List<String> decode(String str) {
char[] strs = str.toCharArray();
ArrayList<String> a = new ArrayList<>() ;
 String s = new String();
for(int i=0 ; i < str.length()-1;i++){
    if (i>=str.length()-1){
        break;
    }
    s = s+strs[i];

    if(strs[i]=='#'  && strs[i+1]=='_'){
    
    s = "";
    a.add(s);
    i = i+1;
    continue;
    }

    if(strs[i+1]=='#'  && strs[i+2]=='_'){
    a.add(s);
    s = "";
    i = i+2;
    }

}
 return a; 
    }
}
