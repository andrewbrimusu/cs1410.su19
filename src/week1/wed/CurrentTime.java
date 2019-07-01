package week1.wed;

public class CurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println("totalMilliseconds: " + totalMilliseconds);
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;
        long currentMinute = totalMinutes % 60;
        long currentSecond = totalSeconds % 60;

        System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
