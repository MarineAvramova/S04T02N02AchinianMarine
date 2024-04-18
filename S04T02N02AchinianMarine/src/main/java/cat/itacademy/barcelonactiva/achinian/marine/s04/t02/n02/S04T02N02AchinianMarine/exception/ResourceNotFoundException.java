package cat.itacademy.barcelonactiva.achinian.marine.s04.t02.n02.S04T02N02AchinianMarine.exception;

public class ResourceNotFoundException extends RuntimeException{
    private static final long seralVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
