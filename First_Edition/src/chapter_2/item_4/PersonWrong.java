package chapter_2.item_4;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Here is a slightly more subtle and much more common example of what not to do,
 * involving mutable objects that are never modified once their values have been computed.
 * @see Person
 */
public class PersonWrong {

    private final Date birthDate;

    // Other fields omitted
    public PersonWrong(Date birthDate) {
        this.birthDate = birthDate;
    }

    // DON'T DO THIS!
    public boolean isBabyBoomer() {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;
    }
}
