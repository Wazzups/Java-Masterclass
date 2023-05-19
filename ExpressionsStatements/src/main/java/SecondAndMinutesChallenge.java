public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        return seconds / 60 / 60  + "h " + seconds / 60 % 60 + "m" + seconds % 60 + "s";
    }

    public static String getDurationString( int minutes, int seconds) {
        if ((minutes < 0 || minutes > 60) || (seconds < 0)) {
            return "Invalid value";
        }

        return getDurationString((minutes * 60) + seconds);
    }
}
