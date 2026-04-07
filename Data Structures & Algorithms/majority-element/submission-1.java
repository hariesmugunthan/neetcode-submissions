class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int count =hm.get(nums[i]);
                hm.put(nums[i],count+1);
            }
             else {
                hm.put(nums[i],1);
             }
        }int v=Integer.MIN_VALUE;
        int k=0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(v<e.getValue())
            {
                v=e.getValue();
                k=e.getKey();
            }
        }
        
        return k;
    }
}