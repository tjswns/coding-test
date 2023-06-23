class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder(); // 결과 문자열을 저장할 StringBuilder 객체 생성

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i); // 문자열의 각 문자를 순회하면서 확인

            if (Character.toLowerCase(c) == Character.toLowerCase(alp.charAt(0))) {
                // 문자를 대소문자 구분 없이 비교하여 해당 문자와 일치하는 경우
                answer.append(Character.toUpperCase(c)); // 대문자로 변환하여 StringBuilder에 추가
            } else {
                answer.append(c); // 변환할 필요가 없는 경우 그대로 추가
            }
        }

        return answer.toString(); // StringBuilder를 문자열로 변환하여 반환
    }
}