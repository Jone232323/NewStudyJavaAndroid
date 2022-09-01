public class TaskSpeedOfLight {
    public static void main(String[] args) {

        final int day = 1000;
        final int speedOfLight = 300000;

        long seconds = day * 24 * 60 * 60;

        long distanceTraveledByLight = seconds*speedOfLight;

        System.out.println("Пройденное растояние света за "+day+" дней = "+distanceTraveledByLight+" км");

    }
}
