package nextstep.play.component.line;

import java.util.ArrayList;
import java.util.List;

import nextstep.play.core.Line;

public class Lines {

    private List<Line> lines = new ArrayList<>();

    public List<Line> getLines() {
        return lines;
    }

    public void add(Line lines) {
        this.lines.add(lines);
    }
}
