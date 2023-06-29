class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[0]; // 초기 빈 배열 X
        
        for (int num : arr) {
            int[] temp = new int[answer.length + num]; // 현재 원소를 추가할 임시 배열 생성
            
            // 이전까지의 배열 X 복사
            for (int i = 0; i < answer.length; i++) {
                temp[i] = answer[i];
            }
            
            // 현재 원소를 반복하여 추가
            for (int i = answer.length; i < temp.length; i++) {
                temp[i] = num;
            }
            
            answer = temp; // 임시 배열을 새로운 배열 X로 갱신
        }
        
        return answer;
    }
}