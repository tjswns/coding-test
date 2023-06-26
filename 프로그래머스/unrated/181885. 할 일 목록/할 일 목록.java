import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 마치지 못한 일을 저장할 리스트 생성
        List<String> unfinishedTasks = new ArrayList<>();

        // todo_list와 finished 배열을 순회하면서 마치지 못한 일을 찾아서 리스트에 추가
        for (int i = 0; i < todo_list.length; i++) {
            // 해당 인덱스의 일이 아직 마치지 못한 경우에만 리스트에 추가
            if (!finished[i]) {
                unfinishedTasks.add(todo_list[i]);
            }
        }

        // 리스트를 문자열 배열로 변환하여 반환
        String[] answer = unfinishedTasks.toArray(new String[0]);
        return answer;
    }
}