package Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AdjustCharacterCounts {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 3);
        map.put('b', 3);
        map.put('c', 3);
        map.put('?', 5);

        // Calculate the number of odd counts that need to be adjusted
        long oddCount = map.entrySet().stream()
                .filter(entry -> entry.getKey() != '?' && entry.getValue() % 2 != 0)
                .count();

        // Adjust the map with the odd counts fixed
        Map<Character, Integer> adjustedMap = map.entrySet().stream()
                .map(entry -> {
                    if (entry.getKey() != '?' && entry.getValue() % 2 != 0) {
                        return new HashMap.SimpleEntry<>(entry.getKey(), entry.getValue() + 1);
                    } else {
                        return entry;
                    }
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Adjust the '?' count
        adjustedMap.put('?', adjustedMap.get('?') - (int) oddCount);

        System.out.println(adjustedMap);
    }
}

