package utils;

public class ChaveInvalidaException extends Exception{
	private static final long serialVersionUID = 1L;

	public ChaveInvalidaException(){
		super();
	}
	
	public ChaveInvalidaException(String message) {
        super(message);
    }

    public ChaveInvalidaException(String message, Throwable throwable) {
        super(message, throwable);
    }
}