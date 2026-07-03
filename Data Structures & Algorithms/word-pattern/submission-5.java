class Solution {
    public boolean wordPattern(String p, String s) {
        String[] str=s.split(" ");
        System.out.println(Arrays.toString(str));
        StringBuilder sb=new StringBuilder();
        int idx=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=' ') {
        //         if( i==s.length()-1) {sb.append(s.charAt(i));str[idx++]=sb.toString();}

        //         sb.append(s.charAt(i));
        //         }
        //     else {str[idx++]=sb.toString();sb=new StringBuilder();}
            
        // }
        if(str.length!=p.length()) return false;

        HashMap<Character,String> hm=new HashMap();
        for(int i=0;i<p.length();i++){
            if(!hm.containsKey(p.charAt(i)))  {
                if(hm.containsValue(str[i])) return false;
                hm.put(p.charAt(i),str[i]);
                } 
            else{
                if(!hm.get(p.charAt(i)).equals(str[i])){ System.out.print(str[i]+" "+hm.get(p.charAt(i))); return false;}
            }
        }
        return true;
    }
}