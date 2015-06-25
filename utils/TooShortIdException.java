package utils;

public class TooShortIdException extends Exception{
private static final long serialVersionUID = 1L;


	public TooShortIdException(){
		super();
	}
	
	public TooShortIdException(String message) {
        super(message);
    }

    public TooShortIdException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
