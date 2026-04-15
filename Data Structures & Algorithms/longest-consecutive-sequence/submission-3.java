class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
       Set<Integer> s=new HashSet();
        int maxi=1;
        int l=1;
        for(int e:nums) s.add(e);
        for(int e:nums){
            if(!s.contains(e-1)){
                int ele=e;
                l=1;
                while(s.contains(ele+1)){
                    l++;
                    ele+=1;
                }
               
                maxi=Math.max(maxi,l);



            }
        }
        return maxi;

    }
}
