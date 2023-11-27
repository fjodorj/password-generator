// Making the class final prevents it from being subclassed
public final class Constants {
    
    // Making fields access modifiers PUBLIC allows for other classes to access them
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = " !@#$%^&*_=+-/.?<>)";
    
    // The class serves as a container for constants and doesn't need to be instantiated to use constants
    private Constants() {}
}
