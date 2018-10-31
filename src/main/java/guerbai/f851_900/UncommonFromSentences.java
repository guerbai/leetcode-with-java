package guerbai.f851_900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {

    private static String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> m = new HashMap<>();
        for (String word: A.split(" ")) {
            m.put(word, m.getOrDefault(word, 0)+1);
        }
        for (String word: B.split(" ")) {
            m.put(word, m.getOrDefault(word, 0)+1);
        }
        List<String> resultList = new ArrayList<>();
        for (String key: m.keySet()) {
            if (m.get(key) == 1 && !m.equals("")) {
                resultList.add(key);
            }
        }
        String[] result = new String[resultList.size()];
        result = resultList.toArray(result);
        return result;
    }

}