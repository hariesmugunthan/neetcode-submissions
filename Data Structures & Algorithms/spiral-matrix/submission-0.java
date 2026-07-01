class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> li=new ArrayList();
        int re=mat.length;
        int ce=mat[0].length;
        
        int rs=0,cs=0;
        
        while(cs<ce && rs<re){

            for(int i=cs;i<ce;i++){
                li.add(mat[rs][i]);
            }
            rs++;
            if (rs >= re) break;

            for(int j=rs;j<re;j++){
                li.add(mat[j][ce-1]);
            }
            ce--;
            if (cs >= ce) break;
            for(int k=ce-1;k>=cs;k--){
                li.add(mat[re-1][k]);
            }
            re--;
            if (rs >= re) break;
            for(int l=re-1;l>=rs;l--){
                li.add(mat[l][cs]);
            }
            cs++;
           

        }
        for(int e:li) System.out.print(e+" ");
        return li;
        
    }
}