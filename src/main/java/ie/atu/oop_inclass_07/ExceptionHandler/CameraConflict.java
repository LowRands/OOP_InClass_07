package ie.atu.oop_inclass_07.ExceptionHandler;

public class CameraConflict extends RuntimeException {
    public CameraConflict(String message) {
        super(message);
    }
}
