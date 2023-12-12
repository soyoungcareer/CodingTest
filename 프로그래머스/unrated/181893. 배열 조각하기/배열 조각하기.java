import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr)
                                .boxed()
                                .collect(Collectors.toList());

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                list.subList(query[i] + 1, list.size()).clear();;
            } else {
                list.subList(0, query[i]).clear();
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}