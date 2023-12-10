package nextstep.play;

import nextstep.play.component.ladder.LadderMakerImpl;
import nextstep.play.component.line.LineMakerImpl;
import nextstep.play.core.LadderMaker;

public class LadderFactory {

    public static LadderMaker getSingleInstance() {
        return new LadderMakerImpl(new LineMakerImpl());
    }
}
