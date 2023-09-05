class Solution {
    public int solution(String my_string) {
        // 공백을 기준으로 문자열을 분리합니다.
        String[] tokens = my_string.split(" ");
        
        // 초기 결과값을 첫 번째 숫자로 설정합니다.
        int result = Integer.parseInt(tokens[0]);
        
        // 순서대로 연산자와 숫자를 처리합니다.
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];  // 연산자
            int num = Integer.parseInt(tokens[i + 1]);  // 숫자
            
            // 연산자에 따라 계산을 수행합니다.
            if (operator.equals("+")) {
                result += num;
            } else if (operator.equals("-")) {
                result -= num;
            }
        }
        
        return result;
    }
}