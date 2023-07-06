class Solution {
    public String solution(String myString, String pat) {
        int patLength = pat.length();
        int startIndex = myString.lastIndexOf(pat);
        String result = myString.substring(0, startIndex + patLength);
        return result;
    }
}