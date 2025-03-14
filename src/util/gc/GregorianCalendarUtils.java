package util.gc;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class GregorianCalendarUtils {
	public static GregorianCalendar resetTime(GregorianCalendar gc) {
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.SECOND, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		return gc;
	}

	public static GregorianCalendar getFirstDateOfMonth(GregorianCalendar gc) {
		gc.set(GregorianCalendar.DAY_OF_MONTH, 1);
		return resetTime(gc);
	}

	public static GregorianCalendar getLastDateOfMonth(GregorianCalendar gc) {
		gc.set(GregorianCalendar.DAY_OF_MONTH, gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
		return resetTime(gc);
	}

	public static LocalDateTime toLocalDateTime(GregorianCalendar gc) {
		return gc.toZonedDateTime().toLocalDateTime();
	}

	public static GregorianCalendar fromLocalDateTime(LocalDateTime dateTime) {
		return GregorianCalendar.from(dateTime.atZone(ZoneId.systemDefault()));
	}

	public static GregorianCalendar getPreviousDay(GregorianCalendar gc) {
		gc.add(GregorianCalendar.DATE, -1);
		return resetTime(gc);
	}

	public static GregorianCalendar getNextDay(GregorianCalendar gc) {
		gc.add(GregorianCalendar.DATE, 1);
		return resetTime(gc);
	}
}