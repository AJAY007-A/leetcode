class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String s = String.valueOf(x);
        int z = 0;
        int t = x;
        int k[] = new int[s.length()];
        for (int i = 0; i < k.length; i++) {
            k[i] = x % 10;
            x = x / 10;
            z = k[i] + z;
        }
        if (t % z == 0) {
            return z;
        } else {
            return -1;
        }
    }
}

//3099. Harshad Number