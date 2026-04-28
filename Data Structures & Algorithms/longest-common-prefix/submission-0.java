class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int l=Integer.MAX_VALUE;
        for(String s:strs)
        l=Math.min(l,s.length());
        for(int i=0;i<l;i++){
            char c=strs[0].charAt(i);
            int co=0;

            for(int j=0;j<strs.length;j++){
                if(c==strs[j].charAt(i)) {
                    co++;
                }
                else break;


            }
            if(co==strs.length)ans+=strs[0].charAt(i);
            else break;
        }
        return ans;
        
    }
}