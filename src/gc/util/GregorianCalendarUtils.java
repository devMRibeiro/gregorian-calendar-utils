package gc.util;

import java.util.GregorianCalendar;

public class GregorianCalendarUtils {
	public static GregorianCalendar resetTime(GregorianCalendar gc) {
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.SECOND, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		return gc;
	}
}