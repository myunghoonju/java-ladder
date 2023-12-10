package nextstep.play.component.ladder;

import nextstep.play.component.line.Lines;
import nextstep.play.core.Ladder;
import nextstep.play.core.LadderMaker;
import nextstep.play.core.Line;
import nextstep.play.core.LineMaker;

public class LadderMakerImpl implements LadderMaker {

    private LineMaker lineMaker;

    public LadderMakerImpl(LineMaker lineMaker) {
        this.lineMaker = lineMaker;
    }

    @Override
    public Ladder create(int peopleCnt, int height) {
        Lines lines = new Lines();
        for (int i = 0; i < height; i++) {
            Line line = lineMaker.create(peopleCnt);
            lines.add(line);
        }

        return new LadderImpl(lines, peopleCnt);
    }
}
