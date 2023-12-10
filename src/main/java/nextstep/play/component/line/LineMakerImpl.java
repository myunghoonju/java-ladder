package nextstep.play.component.line;

import nextstep.play.component.move.Movement;
import nextstep.play.component.move.Movements;
import nextstep.play.core.Line;
import nextstep.play.core.LineMaker;
import nextstep.play.utils.RandomBoolean;

public class LineMakerImpl implements LineMaker {

    @Override
    public Line create(int peopleCnt) {
        Movements movements = new Movements();
        Movement movement = Movement.begin(RandomBoolean.generate());
        movements.add(movement);

        while(movement.untilBeforeLastPoint(peopleCnt)) {
            movement = movement.next();
            movements.add(movement);
        }

        movements.add(movement.last());

        System.out.println("movements - " + movements);
        return new LineImpl(movements);
    }
}
