class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone(); // arr 배열을 복사하여 answer 배열 생성
        
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }
        
        return answer;
    }
}