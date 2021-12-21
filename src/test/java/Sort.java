import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sort.lv1.q42748.Solution;

/**
 * Sort Test
 *
 * @author tildev
 * date 2021-12-21
 */
public class Sort {
    @Test
    public void q42748() {
        Solution solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = {5, 6, 3};
        solution.solution(array, commands);
        Assertions.assertArrayEquals(new int[]{5, 6, 3}, answer);
    }
}
