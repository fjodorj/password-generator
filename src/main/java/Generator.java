import java.util.Random;

public class Generator {

    private Constants constants;
    private int length;
    
    private Random random;
    
    public Generator(Constants constants, int length, Random random) {
        this.constants = constants;
        this.length = length;
        this.random = random;
    }
    
    
}
