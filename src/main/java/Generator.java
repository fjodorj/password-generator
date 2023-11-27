import java.util.Random;

public class Generator {
    
    public Generator() {}
    
    public char[] generate(int length) {
        Random random = new Random();
        String values = Constants.VALUES;
        char[] password = new char[length];
        
        for (int i = 0; i < length; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
}
