class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int counter =0;
        for(int num:arr){
            if(num%2==1) counter++;
            else counter = 0;

            if(counter==3) return true;
        }
            return false;  
    }
}

//1550. Three Consecutive Odds