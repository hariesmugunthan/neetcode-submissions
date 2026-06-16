class Solution {
    public String convert(String s, int row) {
        if(row==1|| s.length()<=row) return s;
        Character a[][]=new Character[row][s.length()];

        int p=0;
        int r=0,c=0;
        while(p<s.length()){
            for(int i=0;i<row;i++){
                if(p<s.length()){
                    a[i][c]=s.charAt(p++);
                }
            }
            c=c+1;
            r=row-2;
            for(int k=0;k<row-2;k++){
                if(p<s.length()){
                    a[r--][c++]=s.charAt(p++);
                }
            }


           


        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]!=null) str.append(a[i][j]);

            }
        }
        
        return str.toString();
        
    }
}