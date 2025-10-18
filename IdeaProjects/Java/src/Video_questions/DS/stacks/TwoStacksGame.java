package Video_questions.DS.stacks;
    import java.util.*;

    public class TwoStacksGame {
        public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
            int sum = 0, i = 0, j = 0, count = 0;

            // Step 1: Take as many as possible from stack A
            while (i < a.size() && sum + a.get(i) <= maxSum) {
                sum += a.get(i);
                i++;
            }

            count = i; // initial count = elements taken from A

            // Step 2: Start taking from stack B
            while (j < b.size()) {
                sum += b.get(j);
                j++;

                // If sum exceeds maxSum, remove elements from A to adjust
                while (sum > maxSum && i > 0) {
                    i--;
                    sum -= a.get(i);
                }

                // If sum is within limit, update max count
                if (sum <= maxSum) {
                    count = Math.max(count, i + j);
                } else {
                    break; // cannot take more
                }
            }

            return count;
        }
}
