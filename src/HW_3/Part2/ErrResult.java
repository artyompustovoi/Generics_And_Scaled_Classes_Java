package HW_3.Part2;

final class ErrResult<R, E> implements Result<R, E> {
    private final E error;

    ErrResult(E error) {
        this.error = error;
    }

    @Override
    public R unwrap() throws UnwrapFailureException {
        switch (error) {
            case RuntimeException re:
                throw new UnwrapFailureException(re);
            case Exception e:
                throw new UnwrapFailureException(e);
            default:
                throw new UnwrapFailureException(error.toString());
        }
    }

    @Override
    public R okOrDefault(R defaultValue) {
        return defaultValue;
    }

    @Override
    public E errOrDefault(E defaultValue) {
        return error;
    }
}
