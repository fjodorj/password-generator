import java.util.Random;

public class Generator {

    private Constants constants;
    private Random random;
    private char[] password;
    
    public Generator(Constants constants, Random random, char[] password) {
        this.constants = constants;
        this.random = random;
        this.password = password;
    }
    
    public char[] generate(int length) {
        String values = Constants.VALUES;
        for (int i = 0; i < length; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
}
