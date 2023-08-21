class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            // 주어진 n이 짝수일 때 짝수를 더하는 부분은 맞습니다.
            // 여기에 추가적인 코드를 작성하여 홀수일 때도 처리해야 합니다.
            for (int i = 2; i <= n; i += 2) {
                answer += i;
            }
        } else {
            // 주어진 n이 홀수인 경우에는 짝수를 더하는 부분에서 1을 뺀 값까지만 더해야 합니다.
            for (int i = 2; i <= n - 1; i += 2) {
                answer += i;
            }
        }
        return answer;
    }
}