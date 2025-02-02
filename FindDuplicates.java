import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class FindDuplicates {
    public static List<Integer> findDuplicatesUsingMap(List<Integer> l) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : l) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (var entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}
