import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WeekDate {
    public String weekDateMethod() {
        String day="";
        DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy EEE");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        day=formatDate.format(cal.getTime())+"\n";
        for (int i = 0; i < 6; i++) {
            cal.add(Calendar.DATE, 1);
        }
        day = day + formatDate.format(cal.getTime());
        return day;
    }
}