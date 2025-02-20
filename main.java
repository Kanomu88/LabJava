class Main {
   private int year;
   private int month;
   private int day;
   private  int objectNumber;
   private  static int objectCounter = 0;
   private static  String[] strMonths = {"January","February", "March", "April", "May", "June",
"July", "August", "September", "October", "November","December"};
    Main(int amonth){
        this.month = amonth;
 }
    public void setmonth(int amonth){
        this.month = amonth;
    }
    public String getstrmonth () {
          return strMonths[month-1];
}
public static void main(String[] args) {
    Main aobj = new Main(2);
    System.out.println(aobj.getstrmonth());
}
}