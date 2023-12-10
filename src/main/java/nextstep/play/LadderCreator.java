package nextstep.play;

import nextstep.play.component.ladder.CompleteLadder;
import nextstep.play.core.Ladder;
import nextstep.play.core.LadderMaker;
import nextstep.play.dto.LadderDto;
import nextstep.play.view.InputView;

public class LadderCreator {

    public static void main(String[] args) {
        LadderDto ladderDto = InputView.acquireInfo();
        LadderMaker ladderMaker = LadderFactory.getSingleInstance();
        Ladder ladder = ladderMaker.create(ladderDto.getParticipants().size(), ladderDto.getHeight());
        CompleteLadder generate = ladder.generate();
    }
}
