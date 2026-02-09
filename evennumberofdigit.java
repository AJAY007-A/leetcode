class Solution {
    public int findNumbers(int[] nums) {
        int d = 0;   
        
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            int n = nums[i];
            
            while (n > 0) {
                c++;
                n = n / 10;
            }
            
            if (c % 2 == 0) {
                d++;   
            }
        }
        
        return d;  
    }
}

//1295. Find Numbers with Even Number of Digits