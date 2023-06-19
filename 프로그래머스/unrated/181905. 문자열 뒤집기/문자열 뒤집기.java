class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        String subString = my_string.substring(s, e + 1);  // s부터 e까지의 문자열 추출
        StringBuilder reversedString = new StringBuilder(subString).reverse();  // 추출한 문자열을 뒤집음
        answer = my_string.substring(0, s) + reversedString.toString() + my_string.substring(e + 1);  // 뒤집은 문자열을 원래 문자열에 삽입

        return answer;
    }
}