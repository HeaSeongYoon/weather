package zerobase.weather.error;

public class InvalidDate extends RuntimeException{
    private static final String MESSAGE = "It's too past or too future date.";

    public InvalidDate() {
        super(MESSAGE);
    }


}
