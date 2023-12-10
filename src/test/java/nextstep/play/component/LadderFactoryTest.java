package nextstep.play.component;

import org.junit.jupiter.api.Test;

import nextstep.play.LadderFactory;
import nextstep.play.component.ladder.CompleteLadder;
import nextstep.play.core.Ladder;
import nextstep.play.core.LadderMaker;

class LadderFactoryTest {

    @Test
    void testCreateLadder() {
        LadderMaker ladderMaker = LadderFactory.getSingleInstance();
        Ladder ladder = ladderMaker.create(3, 5);
        CompleteLadder generate = ladder.generate();
        System.out.println(generate);
    }
}
