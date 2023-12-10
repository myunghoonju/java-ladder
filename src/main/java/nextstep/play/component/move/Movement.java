package nextstep.play.component.move;

public class Movement {

    private final int whereabouts;
    private final Step step;

    public Movement(int whereabouts, Step step) {
        this.whereabouts = whereabouts;
        this.step = step;
    }

    public int go() {
        return whereabouts + step.go();
    }

    public static Movement begin(boolean right) {
        return new Movement(0, Step.begin(right));
    }

    public boolean untilBeforeLastPoint(int peopleCnt) {
        return (peopleCnt - 2) > whereabouts;
    }

    public Movement next() {
        return new Movement(whereabouts + 1, step.next());
    }

    public Movement last() {
        return new Movement(whereabouts + 1, step.last());
    }

    @Override
    public String toString() {
        return "Movement{" +
               "whereabouts=" + whereabouts +
               ", step=" + step +
               '}';
    }
}
