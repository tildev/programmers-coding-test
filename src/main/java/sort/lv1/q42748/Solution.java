package sort.lv1.q42748;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * K번째수
 *
 * @author tildev
 * date 2021-12-21
 */
public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list;
        for (int i = 0; i < commands.length; i++) {
            list = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            list.sort(Comparator.naturalOrder());
            answer[i] = list.get(commands[i][2] - 1);
        }
        return answer;
    }
}
