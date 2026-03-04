package ie.atu.oop_inclass_07.ExceptionHandler;

public class NotFound extends RuntimeException{
    public NotFound(String message){
        super(message);
    }
}
