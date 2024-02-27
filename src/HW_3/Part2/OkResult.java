package HW_3.Part2;

final class OkResult<R, E> implements Result<R, E> {
    private final R result;

    OkResult(R result) {
        this.result = result;
    }

    @Override
    public R unwrap() {
        return result;
    }

    @Override
    public R okOrDefault(R defaultValue) {
        return result;
    }

    @Override
    public E errOrDefault(E defaultValue) {
        throw new UnsupportedOperationException("Cannot call errOrDefault on OkResult");
    }
}
