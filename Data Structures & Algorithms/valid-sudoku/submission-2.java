class Solution {
    public boolean isValidSudoku(char[][] b) {
        int[] arr;
        //row
        for(int i=0;i<9;i++){
            arr=new int[9];
            for(int j=0;j<9;j++){
                if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }System.out.println(Arrays.toString(arr));
           for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
           }

        }
        //col
          for(int i=0;i<9;i++){
            arr=new int[9];
            for(int j=0;j<9;j++){
                if(b[j][i]=='.') continue;
                arr[b[j][i]-'1']++;
            }System.out.println(Arrays.toString(arr));
           for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
           }

        }
        //1
         arr=new int[9];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//2
         arr=new int[9];
        for(int i=0;i<=2;i++){
            for(int j=3;j<=5;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//3
        arr=new int[9];
        for(int i=0;i<=2;i++){
            for(int j=6;j<=8;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//4
        arr=new int[9];
        for(int i=3;i<=5;i++){
            for(int j=0;j<=2;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//5
        arr=new int[9];
        for(int i=3;i<=5;i++){
            for(int j=3;j<=5;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//6
        arr=new int[9];
        for(int i=3;i<=5;i++){
            for(int j=6;j<=8;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//7
        arr=new int[9];
        for(int i=5;i<=8;i++){
            for(int j=0;j<=2;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//8
         arr=new int[9];
        for(int i=5;i<=8;i++){
            for(int j=3;j<=5;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }//9
         arr=new int[9];
        for(int i=5;i<=8;i++){
            for(int j=6;j<=8;j++){
                 if(b[i][j]=='.') continue;
                arr[b[i][j]-'1']++;
            }


        }System.out.println(Arrays.toString(arr));
        for(int k=0;k<9;k++){
            if(arr[k]>1) return false;
        }


        return true;
    }
}
