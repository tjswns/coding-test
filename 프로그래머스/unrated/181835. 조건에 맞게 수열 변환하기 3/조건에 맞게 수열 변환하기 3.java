class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length]; // arr와 동일한 크기로 초기화된 배열

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) { // k가 홀수인 경우
                answer[i] = arr[i] * k; // arr의 원소에 k를 곱하여 대입
            } else { // k가 짝수인 경우
                answer[i] = arr[i] + k; // arr의 원소에 k를 더하여 대입
            }
        }

        return answer; // 변환된 결과 배열 반환
    }
}