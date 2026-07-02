class Solution {
    public boolean isHappy(int a) {
       // List<Integer> li=new ArrayList();
        int t=0;
    while(t!=1 && t!=4) {
        t=0;
        while (a != 0) {
            int i = a % 10;
           // System.out.println(i);
            t = t + i * i;
            //System.out.println(t);

            a = a / 10;
        }
        a = t;
       

        System.out.println(a);
        if(t==1) return true;
        
    }return false;
    }
    
}