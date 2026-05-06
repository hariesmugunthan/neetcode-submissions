class Solution {
    public int maxProfit(int[] n) {
        int mx=0;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                if(n[i]<n[j]){
                    mx=Math.max(mx,n[j]-n[i]);

                }
                else continue;
            }
        }
        return mx;
        
    }
}