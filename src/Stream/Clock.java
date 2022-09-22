package Stream;

import java.sql.Time;
import java.time.Duration;

public class Clock {
    public static void main(String[] args) {
        System.out.println(Past(23, 27, 21));
    }
    public static int Past(int h, int m, int s){


        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}
