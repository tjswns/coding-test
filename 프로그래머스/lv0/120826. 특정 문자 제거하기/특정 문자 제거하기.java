class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder(); // StringBuilder를 사용하여 문자열을 효율적으로 조작합니다.

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i); // 현재 문자를 가져옵니다.
            
            // 만약 현재 문자가 letter와 다르다면, answer에 추가합니다.
            if (currentChar != letter.charAt(0)) {
                answer.append(currentChar);
            }
        }
        
        return answer.toString(); // StringBuilder를 문자열로 변환하여 반환합니다.
    }
}