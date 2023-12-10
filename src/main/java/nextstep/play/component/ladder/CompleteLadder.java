package nextstep.play.component.ladder;

import java.util.HashMap;
import java.util.Map;

public class CompleteLadder {

    private Map<Integer, Integer> result = new HashMap<>();

    public void add(int at, int to) {
        result.put(at, to);
    }

    @Override
    public String toString() {
        return "CompleteLadder{" +
               "result=" + result +
               '}';
    }
}
