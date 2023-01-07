package hust.soict.dsai.aims.exception;

public class PlayerException extends Exception {

	public PlayerException() {
		// TODO Auto-generated constructor stub
	}
	public PlayerException(String mes) {
		super(mes);
		System.err.println(mes);
	}
}
