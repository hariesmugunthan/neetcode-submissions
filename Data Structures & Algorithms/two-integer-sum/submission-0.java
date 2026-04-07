class Solution {
    int [] a=new int[2];
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                   if( nums[i]+nums[j]==target){
                    if(i<j){
                        a[0]=i;
                        a[1]=j;

                    }
                    else{
                         a[0]=j;
                        a[1]=i;
                    }

                   }
                }
            }
        }
        return a;
        
    }
}
