import clock.BRLClock;
import clock.USClock;
import clock.Clock;

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setHour(13);
        brlClock.setMinute(25);
        brlClock.setSecond(59);

        System.out.println(brlClock.getTime());

        System.out.println(new USClock().convert(brlClock).getTime());

    }
}