package HW_3.Part1;
public class UnwrapFailureException extends Exception {
    private final Object errorObject;

    public UnwrapFailureException(String message, Object errorObject) {
        super(message);
        this.errorObject = errorObject;
    }

    public Object getErrorObject() {
        return errorObject;
    }
}

