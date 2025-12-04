import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class QUE5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("orange", 2);

        Map<String, Integer> sorted =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())    // 🔥 sort by value
                        .collect(
                                Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (e1, e2) -> e1,
                                        LinkedHashMap::new           // 🔥 keep sorted order
                                )
                        );

        System.out.println(sorted);
    }
}
