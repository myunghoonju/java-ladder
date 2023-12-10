package nextstep.play.component.move;

import java.util.ArrayList;
import java.util.List;

public class Movements {

    private List<Movement> movements = new ArrayList<>();

    public void from(List<Movement> movements) {
        this.movements.addAll(movements);
    }

    public void add(Movement movement) {
        movements.add(movement);
    }

    public Movement getMovement(int at) {
        return movements.get(at);
    }

    @Override
    public String toString() {
        return "Movements{" +
               "movements=" + movements +
               '}';
    }
}
