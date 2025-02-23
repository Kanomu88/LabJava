import java.time.LocalDate;;
class MyDate {
    private int year;
    private int month;
    private int day;
    private int objectNumber;
    private static int objectCounter = 0;
    private static String[] strMonths = {"January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November",
    "December"};

     MyDate(int aYear, int aMonth, int aDay){
        this.year = aYear;
        this.month = aMonth;
        this.day = aDay;
        objectCounter++;
        objectNumber = objectCounter;
    }

    MyDate() {
        year = 1900;
        month = 1;
        day = 1;
        objectCounter++;
        objectNumber = objectCounter;
    }

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 100!= 0 || year % 400 == 0);
    }
    public int getObjectNumber(){
        return objectNumber;
    }

    public void setDate (int aYear,int aMonth, int aDay) {
        this.year = aYear;
        this.month = aMonth;
        this.day = aDay;
    }
    public void setYear(int aYear) {
        this.year = aYear;

    }
    public void setMonth(int aMonth)  {
        this.month = aMonth;

    }

    public void setDay(int aDay){
        this.day = aDay;

    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String toString(){
        return String.format("%02d %s %d", day, strMonths[month - 1], year);
    }

    public MyDate nextDay(){
        LocalDate localDate = LocalDate.of(year, month, day).plusDays(1);
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
        return this;
    }
    public MyDate nextMonth(){
        LocalDate localDate = LocalDate.of(year, month, day).plusMonths(1);
         this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
        return this;
    }

    public MyDate nextYear(){
        LocalDate localDate = LocalDate.of(year, month, day).plusYears(1);
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
        return this;
    }
    public MyDate previousDay(){
        LocalDate localDate = LocalDate.of(year, month, day).minusDays(1);
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
        return this;
    }

    public MyDate previousMonth(){
        LocalDate localDate = LocalDate.of(year, month, day).minusMonths(1);
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
        return this;
    }
    public MyDate previousYear(){
        LocalDate localDate = LocalDate.of(year, month, day).minusYears(1);
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
        return this;
    }
}