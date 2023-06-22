class Solution {
    public int solution(String myString, String pat) {
      myString = myString.toLowerCase(); // 대소문자 구분을 없애기 위해 소문자로 변환
        pat = pat.toLowerCase(); // 대소문자 구분을 없애기 위해 소문자로 변환  
        int answer = 0;
        if (myString.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}