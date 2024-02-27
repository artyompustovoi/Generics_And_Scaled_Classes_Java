package HW_3.Part2;

class UnwrapFailureException extends Exception {
    UnwrapFailureException(Object error) {
        super("Failed to unwrap result: " + error);
    }
}