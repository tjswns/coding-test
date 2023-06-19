class Solution {
    public int solution(int[] num_list) {
        int answer = -1; // 음수 인덱스를 저장할 변수를 -1로 초기화합니다.

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) { // 현재 요소가 음수인지 확인합니다.
                answer = i; // 음수의 인덱스를 answer에 저장합니다.
                break; // 첫 번째로 나오는 음수를 찾았으므로 반복문을 종료합니다.
            }
        }

        return answer; // 음수의 인덱스를 반환합니다.
    }
}