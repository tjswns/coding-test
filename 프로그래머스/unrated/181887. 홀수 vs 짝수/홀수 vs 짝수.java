class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int length = num_list.length;
        int sumOdd = 0; // 홀수 번째 원소들의 합을 저장할 변수
        int sumEven = 0; // 짝수 번째 원소들의 합을 저장할 변수

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sumEven += num_list[i]; // 짝수 번째 원소의 합 계산
            } else {
                sumOdd += num_list[i]; // 홀수 번째 원소의 합 계산
            }
        }

        // 두 합 중에서 큰 값을 선택하여 answer에 저장
        answer = Math.max(sumOdd, sumEven);

        return answer;
    }
}