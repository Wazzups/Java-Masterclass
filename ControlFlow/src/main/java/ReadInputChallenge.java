import java.util.Scanner;

public class ReadInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int validNumbers = 0;
        int sum = 0;
        while (validNumbers < 5) {
            System.out.println("Enter number: ");
            String number = scanner.nextLine();

            try {
                System.out.println("Number: " + Integer.parseInt(number) + " is valid");
                validNumbers++;
                sum += Integer.parseInt(number);
            } catch(Exception e) {
                System.out.println("Invalid Number");
            }
        }
    }

}
