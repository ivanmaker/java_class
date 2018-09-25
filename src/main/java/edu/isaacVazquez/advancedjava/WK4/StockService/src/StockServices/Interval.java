package StockServices;

public class Interval {
    Week week;
    public enum Week {
        WK1, WK2, WK3, WK4
    }

    public Week selectWeek(String WEEK) {
        switch (week) {
            case WK1:
                if (WEEK == "WK1");
                week = Week.WK1;
            case WK2:
                if (WEEK == "WK2");
                week = Week.WK2;
            case WK3:
                if (WEEK == "WK3");
                week = Week.WK3;
            case WK4:
                if (WEEK == "WK4");
                week = Week.WK4;
        }
        return week;
    }
}
