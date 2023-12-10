package nextstep.play.component.ladder;

import nextstep.play.component.line.Lines;
import nextstep.play.core.Ladder;
import nextstep.play.core.Line;

public class LadderImpl implements Ladder {

    private final Lines lines;
    private final int peopleCnt;

    public LadderImpl(Lines lines, int peopleCnt) {
        this.lines = lines;
        this.peopleCnt = peopleCnt;
    }

    @Override
    public CompleteLadder generate() {
        CompleteLadder completion = new CompleteLadder();
        for (int count = 0; count < peopleCnt; count++) {
            completion.add(count, to(count));
        }

        return completion;
    }

    private int to(int count) {
        int to = count;
        for (Line line : lines.getLines()) {
            to = line.move(to);
        }
        return to;
    }
}
