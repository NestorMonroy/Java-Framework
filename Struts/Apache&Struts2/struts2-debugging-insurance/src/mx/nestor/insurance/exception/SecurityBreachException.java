package mx.nestor.insurance.exception;

public class SecurityBreachException extends Exception {

	private static final long serialVersionUID = -5342616107268474834L;

	public SecurityBreachException() {
		super("Security Exception");

	}

	public SecurityBreachException(String message) {
		super(message);
	}

}
