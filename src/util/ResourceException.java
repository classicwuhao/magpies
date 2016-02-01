package util;
import java.lang.RuntimeException;

public abstract class ResourceException extends RuntimeException{
	private String message;
	public ResourceException(){};
	public ResourceException(String m){
		message = m;
	}

	public String getMessage(){
		return message;
	}
	
}
