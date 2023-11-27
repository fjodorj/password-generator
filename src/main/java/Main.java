import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();
        
        UserInterface ui = new UserInterface(scanner, generator);
        ui.start();
        
    }
}
