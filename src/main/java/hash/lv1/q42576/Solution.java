package hash.lv1.q42576;

import java.util.Arrays;

/**
 * 완주하지 못한 선수
 *
 * @author tildev
 * date 2021-12-20
 */
public class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }
}