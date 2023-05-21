import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParsingValueAndReading {

    public static void main(String[] args) {
        int currentYear = 2022;
        String userDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);
        System.out.println("Age = " + currentYear + userDateOfBirth);


        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch(NullPointerException e) {
            System.out.println(getInputFromConsole(currentYear));
        }
    }

    /* Reading data from the console
    * System.in -> Like System.out, java provide System.in which can read input from the console or terminal.
    * System.console -> This is Java's solution for easier support for reading a single line and prompting user for information. It's disabled on I.D.E.'s
    * Command Line Arguments -> This is calling the java program and specifying data in the call.
    * Scanner -> The scanner calss was built to be a common way to read input, either using System.in or a file.*/

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int date = Integer.parseInt(dateOfBirth);

        return "So you are " + name + " and u have " + (currentYear - date);
    }

    /* The Scanner class is described as a simple text scanner, which can parse primitive types and strings. To use the Scanner class, we have to create an instance of Scanner. */
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        // Scanner on file input
        try {
            Scanner sc = new Scanner(new File("nameOfFileOnFileSystem"));
        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return name;
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }

    /* An exception is an error that happens in code. Some types of errors can be predicted and named. */

    /*Try Statement
    * The try statement actually has two code blocks. The first is declared directly after the try keyword, and this code block ends, and is followed by the declaration of the catch keyword. */
}