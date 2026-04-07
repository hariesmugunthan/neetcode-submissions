class Solution {

    public String encode(List<String> strs) {
        String s="";
        for(String li:strs){
            String sub=li;
            for(int i=0;i<sub.length();i++){
                char c=sub.charAt(i);
                int a=(int)c+3;
                s=s+(char)a;
            }
            s=s+" ";
        }System.out.println(s);
        return s;

    }

    public List<String> decode(String str) {
        List<String> li=new ArrayList();
        String s="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                int a=(int)str.charAt(i)-3;
                s=s+(char)a;
            }else{
                li.add(s);
                s="";
            }

        }
        return li;

    }
}
