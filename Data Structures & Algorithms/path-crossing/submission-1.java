class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        Set<String> s=new HashSet();
        s.add(x+","+y);

        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N') x+=1;
            if(path.charAt(i)=='S') x-=1;
            if(path.charAt(i)=='E') y+=1;
            if(path.charAt(i)=='W') y-=1;
            if(s.contains(x+","+y)) return true;
            else s.add(x+","+y);
            

        }
        return false;
        
    }
}