public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message){
        super(message);
    }
}

// RuntimeException = unchecked - throw
// Exception = checked - throws
