class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length(), word2.length());
        String result = "";
        for(int i = 0;i<n;i++){
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        result += word1.substring(n);
        result += word2.substring(n);
        return result;

    }
}