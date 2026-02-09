class Solution {
    public int[] runningSum(int[] n) {
          int m=0;
        int x[]=new int[n.length];
        for(int i=0;i<n.length;i++){
            m=0;
            for(int j=0;j<=i;j++){
                m=m+n[j];
                x[i]=m;
                
            }
            
        }
        return x;
    }
}

//1480. Running Sum of 1d Array