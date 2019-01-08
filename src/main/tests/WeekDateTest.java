import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class WeekDateTest {

    WeekDate object;
    @Before
    public void setUp() {
        object = new WeekDate();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void testWeekDateMethodSuccess() {
        String expectedlValue="07/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue= object.weekDateMethod();
        assertEquals(expectedlValue,actualValue);
    }
    @Test
    public void testWeekDateMethodFailure(){
        String expectedlValue="27/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=object.weekDateMethod();
        assertNotEquals(expectedlValue,actualValue);
    }

    @Test
    public void testWeekDateMethodNeutral() {
        assertNotNull(object.weekDateMethod());
    }
}