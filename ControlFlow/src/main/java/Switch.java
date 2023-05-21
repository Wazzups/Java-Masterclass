public class Switch {
    public static void main(String[] args) {
        int num1 = 1;
        switch (num1) {
            case 1:
                System.out.println("It's number 1");
                break;
            case 2:
                System.out.println("It's number 2");
                break;
            case 3: case 4: case 5:
                System.out.println("It was 3, 4 or 5");
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        String month = "APRIL";
        System.out.println(month + " is on " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month){
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
            default:
                return "Invalid value";
        }
    }

    /*  Valid Switch Value Types
    * byte, short, int, char
    * Byte,Short, Integer, Character
    * String
    * enum */

    /* Once a switch case label matches the switch variable, no more cases are checked.
    * Any code after the case label where there was a match found, will be executed, until a break statement, or the end of the switch statement occurs. */

}
