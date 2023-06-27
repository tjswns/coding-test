class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int length = num_list.length;

        if (length >= 11) {
            for (int num : num_list) {
                answer += num; // 리스트에 있는 모든 원소의 합을 계산
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num; // 모든 원소의 곱을 계산
            }
        }

        return answer;
    }
}