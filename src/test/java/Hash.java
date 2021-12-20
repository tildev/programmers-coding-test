import hash.lv1.q42576.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Hash {
    @Test
    public void q42576(){
        Solution solution = new Solution();

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String answer1 = solution.solution(participant1, completion1);
        Assertions.assertEquals("leo", answer1);

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String answer2 = solution.solution(participant2, completion2);
        Assertions.assertEquals("vinko", answer2);

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        String answer3 = solution.solution(participant3, completion3);
        Assertions.assertEquals("mislav", answer3);
    }
}
