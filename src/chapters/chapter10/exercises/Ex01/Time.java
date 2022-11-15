package chapters.chapter10.exercises.Ex01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        this.hour = (int) (elapsedTime / (60 * 60 * 1000) % 24);
        this.minute = (int) (elapsedTime / (60 * 1000) % 60);
        this.second = (int) (elapsedTime / 1000 % 60);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setTime(long elapsedTime) {
        long tSecond = elapsedTime / 1000;
        this.second = (int) tSecond % 60;

        long tMinute = elapsedTime / 60;
        this.minute = (int) tMinute % 60;

        long tHour = elapsedTime / 60;
        this.hour = (int) tHour % 24;
    }

    public void displayTime() {
        System.out.println((this.getHour() < 10 ? "0" + this.getHour() + 3 : this.getHour() + 3) + ":" +
                (this.getMinute() < 10 ? "0" + this.getMinute() : this.getMinute()) + ":" +
                (this.getSecond() < 10 ? "0" + this.getSecond() : this.getSecond()));
    }
}
