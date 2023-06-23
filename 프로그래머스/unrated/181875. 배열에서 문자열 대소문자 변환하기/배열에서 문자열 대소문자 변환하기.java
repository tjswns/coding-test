class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length]; // 결과를 저장할 배열 생성

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) { // 짝수 번째 인덱스일 때
                answer[i] = strArr[i].toLowerCase(); // 소문자로 변환하여 저장
            } else { // 홀수 번째 인덱스일 때
                answer[i] = strArr[i].toUpperCase(); // 대문자로 변환하여 저장
            }
        }

        return answer; // 결과 배열 반환
    }
}