class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))) hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else hm.put(s.charAt(i),1);
        }
         for(Map.Entry<Character,Integer> i:hm.entrySet()){
          
           System.out.println(i.getKey()+" "+i.getValue());
        }
        for(int i=0;i<t.length();i++){
             if(hm.containsKey(t.charAt(i))) hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
             else return t.charAt(i);
        }
        for(Map.Entry<Character,Integer> i:hm.entrySet()){
           if(i.getValue()==-1) return i.getKey();
           System.out.println(i.getKey()+" "+i.getValue());
        }
      
        return ' ';
    }
}