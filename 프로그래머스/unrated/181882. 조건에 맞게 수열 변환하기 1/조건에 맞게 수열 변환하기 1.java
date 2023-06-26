class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2; // 50보다 크거나 같은 짝수는 2로 나눔
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i] * 2; // 50보다 작은 홀수는 2를 곱함
            } else {
                answer[i] = arr[i]; // 그 외의 경우에는 원래의 값 그대로 유지
            }
        }

        return answer;
    }
}