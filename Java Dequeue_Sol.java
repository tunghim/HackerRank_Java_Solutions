import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class test {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final Deque<Integer> deque = new ArrayDeque<>();
        final int n = in.nextInt();
        final int m = in.nextInt();

        int maxUnique = 0;
        int uniqueSize = 0;
        final HashMap<Integer, Integer> counterMap = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            final int num = in.nextInt();
            if (deque.size() >= m) {
                final Integer pollNum = deque.pollLast();
                final int count = counterMap.get(pollNum);
                if (count == 1) {
                    counterMap.remove(pollNum);
                    --uniqueSize;
                } else {
                    counterMap.put(pollNum, count - 1);
                }
            }
            deque.addFirst(num);
            if (counterMap.containsKey(num)) {
                counterMap.put(num, counterMap.get(num) + 1);
            } else {
                counterMap.put(num, 1);
                ++uniqueSize;
                if (uniqueSize > maxUnique) {
                    maxUnique = uniqueSize;
                }
            }
        }
        System.out.println(maxUnique);
    }
}