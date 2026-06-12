class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        int l=s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && i==l) {l--;continue;}
            
            if(s.charAt(i)!=' ') c++;
            else break;
        }
        return c;
        
    }
}