class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=0;
        for(int i=nums1.length-n;i<m+n;i++){
            nums1[i]=nums2[idx++];

        }
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
        
    }
}