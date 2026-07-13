class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> li=Arrays.stream(nums).distinct().sorted().boxed().collect(Collectors.toList());
        int[] arr=new int[nums.length];
        int p=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=p++;
        }
        List<Integer> li2=new ArrayList();
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            if(!li.contains(k)) li2.add(k);
        }
        return li2;
        
    }
}