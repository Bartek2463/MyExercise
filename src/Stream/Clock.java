package Stream;

import java.sql.Time;

public class Clock {
    public static void main(String[] args) {
        System.out.println(Past(23, 27, 21));
    }
    public static int Past(int h, int m, int s){


        return h*3600000 + m * 60000+s*1000;
    }
}
