package nextstep.play.component.line;

import nextstep.play.component.move.Movements;
import nextstep.play.core.Line;

public class LineImpl implements Line {

    private final Movements movements;

    public LineImpl(Movements movements) {
        this.movements = movements;
    }

    @Override
    public int move(int at) {
        return movements.getMovement(at).go();
    }

    @Override
    public String toString() {
        return "LineImpl{" +
               "movements=" + movements +
               '}';
    }
}
