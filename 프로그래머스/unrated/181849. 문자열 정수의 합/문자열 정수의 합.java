class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        // 문자열을 순회하면서 각 자리수의 합을 계산
        for (int i = 0; i < num_str.length(); i++) {
            // 현재 자리의 문자를 숫자로 변환하여 합에 더함
            int digit = Character.getNumericValue(num_str.charAt(i));
            answer += digit;
        }
        
        return answer;
    }
}