class Solution {
    public int LengthOfLastWord(String s) {
        String word[]=s.split(" ");
        String lastword=word[word.length-1];
        int length=lastword.length();
        return length;
        
    }
}