package mysery.interview.problems.occurrences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mysery.interview.problems.groupby.IGroupBy;

public class Occurrences implements IOccurrences {

    @Override
    public Map<Character, Integer> wordOccurrences(String word, IGroupBy groupBy) {
        List<Character> wordCharacters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordCharacters.add(word.charAt(i));
        }
        Map<Character, Collection<Character>> m = groupBy.groupBy(wordCharacters, Character::toLowerCase);
        Map<Character, Integer> result = new HashMap<>();
        m.entrySet().stream().forEach((entrySet) -> {
            Character key = entrySet.getKey();
            Collection<Character> value = entrySet.getValue();
            result.put(key, value.size());
        });
        return result;
    }
}
