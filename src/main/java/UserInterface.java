import java.util.Scanner;

public class UserInterface {

    private Generator generator;
    private Scanner scanner;
    
    public UserInterface(Generator generator, Scanner scanner) {
        this.generator = generator;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Enter the length of your new password: ");
            Integer userInput = Integer.valueOf(scanner.nextLine());
            scanner.close();
            System.out.println(generator.generate(userInput));
        }
    }
}
