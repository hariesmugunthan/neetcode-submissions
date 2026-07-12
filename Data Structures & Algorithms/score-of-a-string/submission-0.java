class Solution {
    public int scoreOfString(String s) {
        int[] a=new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=(int)s.charAt(i);
        }
       // System.out.println(Arrays.toString(a));
       int t=0;
       for(int i=1;i<a.length;i++){
        t=t+Math.abs(a[i]-a[i-1]);

       }
        return t;
    }
}