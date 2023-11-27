import java.util.Scanner;

public class UserInterface {
    
    private final Scanner scanner;
    private final Generator generator;
    
    public UserInterface(Scanner scanner, Generator generator) {
        this.scanner = scanner;
        this.generator = generator;
    }
    public void start() {
        
        while (true) {
            
            Scanner scanner = new Scanner(System.in);
            Generator generator = new Generator();
            
            System.out.print("Enter the length of your new password: ");
            Integer userInput = Integer.valueOf(scanner.nextLine());
            if (userInput <= 0) {
                break;
            }
            
            generator.generate(userInput);
            System.out.println(generator.generate(userInput));
            System.out.println("Input 0 to exit.");
            
        }
    }
}
