package com.javase8.programs;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDifference {

    public static void main(String[] args) {
        calculateTimeDifference("11:05:04", "11:05:04"); // now
        calculateTimeDifference("11:05:04", "11:05:00"); // 4 seconds ago
        calculateTimeDifference("11:05:04", "11:00:00"); // 5 minutes ago
        calculateTimeDifference("11:05:04", "10:00:00"); // 1 hour ago
        calculateTimeDifference("11:05:04", "11:55:04"); // 50 minutes ahead
        calculateTimeDifference("11:59:04", "11:59:59"); // 55 seconds ahead
        calculateTimeDifference("11:05:59", "11:59:59"); // 54 minutes ahead
        calculateTimeDifference("09:55:54", "11:59:59"); // 2 hours ahead
        calculateTimeDifference("11:05:59", "11:06:59"); // 1 minute ahead
        calculateTimeDifference("11:59:58", "11:59:59"); // 1 second ahead
    }

    private static void calculateTimeDifference(String time1, String time2) {
        String[] t1 = time1.split(":");
        LocalTime localTime1 = LocalTime.of(Integer.parseInt(t1[0]), Integer.parseInt(t1[1]), Integer.parseInt(t1[2]));
        String[] t2 = time2.split(":");
        LocalTime localTime2 = LocalTime.of(Integer.parseInt(t2[0]), Integer.parseInt(t2[1]), Integer.parseInt(t2[2]));
        Duration timeDifference = Duration.between(localTime1, localTime2);
        print(timeDifference);
    }

    private static void print(Duration timeDifference) {
        long h = timeDifference.toHours();
        long m = timeDifference.toMinutes();
        long s = timeDifference.toMillis() / 1000;
        if (h != 0) {
            if (h < 0) {
                System.out.print(h * -1);
            } else {
                System.out.print(h);
            }

            if (h * -1 == 1) {
                System.out.print(" hour");
            } else {
                System.out.print(" hours");
            }
            System.out.print(aheadOrAgo(h));
        } else if (m != 0) {
            if (m < 0) {
                System.out.print(m * -1);
            } else {
                System.out.print(m);
            }
            if (m * -1 == 1) {
                System.out.print(" minute");
            } else {
                System.out.print(" minutes");
            }
            System.out.print(aheadOrAgo(m));
        } else if (s != 0) {
            if (s < 0) {
                System.out.print(s * -1);
            } else {
                System.out.print(s);
            }
            if (s * -1 == 1) {
                System.out.print(" second");
            } else {
                System.out.print(" seconds");
            }
            System.out.print(aheadOrAgo(s));
        } else {
            System.out.print("now");
        }
        System.out.println();
    }

    private static String aheadOrAgo(long t) {
        return t > 0 ? " ahead" : " ago";
    }
}
