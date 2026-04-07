class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map= new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else map.put(nums[i],1);
        }
        int[]ans=new int[k];
        int[][] arr=new int[map.size()][2];
        int idx=0;
        for(Map.Entry<Integer,Integer> mi:map.entrySet()){
            arr[idx][0]=mi.getKey();
            arr[idx++][1]=mi.getValue();


        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i][1]<arr[j][1]){
                    int[] t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;

                }
            }
        }  for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }idx=0;
        for(int i=0;i<k;i++){
            ans[i]=arr[idx++][0];
        }
        return ans;
        
    }
}
