class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];

        }

        if(nums[n-1]==0) return 0;
        for(int i=0;i<n;i++){
            if(i==0){
                if(0==(nums[n-1]-nums[0])) return 0;
            }
            if(i!=0 && nums[i-1]==(nums[n-1]-nums[i])) return i;
        }
        return -1;
        
    }
}