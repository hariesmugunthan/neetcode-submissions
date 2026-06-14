class Solution {
    public boolean hasDuplicate(int[] nums) {
         List<Integer> li=new ArrayList();
        for(int e:nums){
        if(li.contains(e)) return true;
        else li.add(e);

        }
        return false;
        
    }
}