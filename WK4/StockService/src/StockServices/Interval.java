package StockServices;

public class Interval {

    public enum chooseWeek {
        WK1, WK2, WK3, WK4
    }

    chooseWeek week;

    public Interval(chooseWeek week) {
        this.week = week;
    }

    public void weekChosen() {
        switch (week) {
            case WK1:
                System.out.println("Biggest Market Place in the World.");
                break;

            case WK2:
                System.out.println("Simplest way to manage Money.");
                break;

            case WK3:
            case WK4:
                System.out.println("1st Web 2.0 Company.");
                break;
        }
    }
}