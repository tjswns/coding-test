class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = (num_list.length + n - 1) / n; // 결과 배열의 길이 계산
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int index = i * n;
            answer[i] = num_list[index];
        }
        
        return answer;
    }
}