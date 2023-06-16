class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        int length = my_string.length();
        if (length <= n) {
            answer = my_string; // n이 문자열 길이보다 크거나 같은 경우, 원래 문자열을 그대로 반환
        } else {
            answer = my_string.substring(length - n); // 문자열의 뒷부분 n글자를 반환
        }
        
        return answer;
    }
}