class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> s=new LinkedHashSet();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int idx=0;
        for(int i:s){
            nums[idx++]=i;
        }
        return s.size();
        
    }
}