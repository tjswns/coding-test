import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5]; // 결과를 담을 배열의 크기를 5로 지정

        Arrays.sort(num_list); // num_list를 오름차순으로 정렬

        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i]; // 가장 작은 5개의 수를 answer 배열에 저장
        }

        return answer;
    }
}