class Solution {
    public boolean checkPerfectNumber(int n) {
        int z=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                z=z+i;
            }
        }
        if(z==n){
            return true;
        } else{
            return false;
        }
    }
}

//507. Perfect Number