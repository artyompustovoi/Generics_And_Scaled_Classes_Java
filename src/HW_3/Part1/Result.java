package HW_3.Part1;
public class Result<R, E> {
    private final R result;
    private final E error;

    private Result(R result, E error) {
        this.result = result;
        this.error = error;
    }

    public  Result<R, E> Ok(R result) {
        return new Result<>(result, null);
    }

    public static <R, E> Result<R, E> Err(E error) {
        return new Result<>(null, error);
    }

    public boolean isOk() {
        return result != null;
    }

    public boolean isErr() {
        return error != null;
    }

    public R unwrap() throws UnwrapFailureException {
        if (isOk()) {
            return result;
        } else {
            throw new UnwrapFailureException("Cannot unwrap result: it contains an error", error);
        }
    }

    public R okOrDefault(R defaultValue) {
        return isOk() ? result : defaultValue;
    }

    public E errOrDefault(E defaultValue) {
        return isErr() ? error : defaultValue;
    }
}
