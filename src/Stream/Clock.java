package Stream;

import java.sql.Time;

public class Clock {
    public static void main(String[] args) {
        System.out.println(Past(23, 27, 21));
    }
    public static int Past(int h, int m, int s){


        return (h*60*60*1000)+(m*60*1000)+(s*1000);
    }
}
