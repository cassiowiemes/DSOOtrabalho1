package utils;

public class ChaveInvalidaException extends Exception{
	// TODO conferir validade dessa classe
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