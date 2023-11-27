import java.util.Scanner;

public class UserInterface {
    
    public UserInterface() {}
    
    
    
    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Generator generator = new Generator();
            
            System.out.print("Enter the length of your new password: ");
            Integer userInput = Integer.valueOf(scanner.nextLine());
            scanner.close();
            generator.generate(userInput);
            System.out.println(generator.generate(userInput));
            break;
        }
    }
}
