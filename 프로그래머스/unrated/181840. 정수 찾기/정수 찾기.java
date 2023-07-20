class Solution {
    public int solution(int[] num_list, int n) {
        // num_list 배열을 순회하면서 n과 같은 원소를 찾습니다.
        for (int num : num_list) {
            if (num == n) {
                // n과 같은 원소를 찾았으면 1을 반환합니다.
                return 1;
            }
        }

        // num_list 배열을 모두 순회했는데도 n과 같은 원소를 찾지 못했으면 0을 반환합니다.
        return 0;
    }
}