public class SwitchChallenge {
    public static void main(String[] args) {
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
        }

    }

    public static void printDayOfWeek(int day){
      switch (day) {
          case 0 -> System.out.println("Sunday");
          case 1 -> System.out.println("Monday");
          case 2 -> System.out.println("Tuesday");
          case 3 -> System.out.println("Wednesday");
          case 4 -> System.out.println("Thursday");
          case 5 -> System.out.println("Friday");
          case 6 -> System.out.println("Saturday");
          default -> System.out.println("Invalid day");
      }
    }

    public static void printDayOfWeekIfElse(int day){
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
