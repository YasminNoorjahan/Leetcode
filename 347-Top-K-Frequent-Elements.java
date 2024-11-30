import java.util.HashMap;

public class test {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.merge(num, 1, Integer::sum);
        }
        int[] result = frequency.entrySet().stream().filter(entry -> entry.getValue() > k).mapToInt(ent -> ent.getValue()).toArray();
        return result.length>0?result : new int[0];
    }
}
