package HW_3.Part2;

sealed interface Result<R, E> permits OkResult, ErrResult {
    R unwrap() throws UnwrapFailureException;
    R okOrDefault(R defaultValue);
    E errOrDefault(E defaultValue);
}
