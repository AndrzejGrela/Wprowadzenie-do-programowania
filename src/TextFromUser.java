import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("witaj użytkowniku"+userInput);

    }
}
