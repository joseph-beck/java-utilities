package date;

public class Date {
    
    private Day day;
    private int dayNumber;
    private Month month;
    private int year;

    public Date(Day day, int dayNumber, Month month, int year) {
        this.day = day;
        this.dayNumber = dayNumber;
        this.month = month;
        this.year = year;
    }

    public Day getDay() {
        return this.day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public Month getMonth() {
        return this.month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format(
            "%s %d %s %s", 
            day,
            dayNumber,
            month,
            year)
        ;
    }
}
