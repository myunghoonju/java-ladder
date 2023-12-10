package nextstep.play.component.move;

import nextstep.play.utils.RandomBoolean;

public class Step {

    private final boolean past;
    private final boolean current;

    public Step(boolean past, boolean current) {
        validate(past, current);

        this.past = past;
        this.current = current;
    }

    static Step of(boolean first, boolean second) {
        return new Step(first, second);
    }

    public static Step begin(boolean current) {
        return of(Boolean.FALSE, current);
    }

    public int go() {
        if (past) {
            return -1;
        }

        if (current) {
            return 1;
        }

        return 0;
    }

    public Step next(boolean future) {
        return of(current, future);
    }

    public Step last() {
        return of(current, Boolean.FALSE);
    }

    public Step next() {
        if (current) {
            return next(Boolean.FALSE);
        }

        return next(RandomBoolean.generate());
    }

    private void validate(boolean past, boolean current) {
        if (past && current) {
            throw new IllegalArgumentException("부적절한 이동입니다");
        }
    }

    @Override
    public String toString() {
        return "Step{" +
               "past=" + past +
               ", current=" + current +
               '}';
    }
}
