import java.util.Calendar;

public class CalendarAlgorithm {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR , 2016);

        //Test calendar set
        System.out.println("YEAR : " + cal.get(Calendar.YEAR));
        System.out.println("Month : " + cal.get(Calendar.MONTH));
        System.out.println("Day of Month : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week : "+ cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of Week : "+ cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}


