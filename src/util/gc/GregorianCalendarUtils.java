package util.gc;

import java.time.LocalDateTime;
import java.util.GregorianCalendar;

/**
 * Utility class for working with {@link GregorianCalendar} in Java.
 * This class provides methods for manipulating dates and times.
 * <p>
 * This class does not modify the original {@link GregorianCalendar} instance 
 * passed to its methods, instead, it returns a new instance or resets the 
 * values of the original instance when appropriate.
 * </p>
 * 
 * @author Michael Ribeiro
 * @version 1.0
 * 
 * @see GregorianCalendar
 * @see LocalDateTime
 */
public class GregorianCalendarUtils {

  /**
   * Utility method to clone a GregorianCalendar instance.
   * This method ensures that the original instance is not modified.
   *
   * @param gc the {@link GregorianCalendar} instance to be cloned
   * @return a new {@link GregorianCalendar} instance that is a clone of the original
   */
  private static GregorianCalendar cloneCalendar(GregorianCalendar gc) {
      return (GregorianCalendar) gc.clone();  // Cria uma cópia do objeto
  }

  /**
   * Resets the time of the given {@link GregorianCalendar} to midnight (00:00:00.000).
   * 
   * @param gc the {@link GregorianCalendar} instance whose time will be reset
   * @return a new {@link GregorianCalendar} instance with the time set to midnight
   */
  public static GregorianCalendar resetTime(GregorianCalendar gc) {
      GregorianCalendar newGc = cloneCalendar(gc);
      newGc.set(GregorianCalendar.HOUR_OF_DAY, 0);
      newGc.set(GregorianCalendar.MINUTE, 0);
      newGc.set(GregorianCalendar.SECOND, 0);
      newGc.set(GregorianCalendar.MILLISECOND, 0);
      return newGc;
  }

  /**
   * Returns the first date of the month for the given {@link GregorianCalendar},
   * with the time reset to midnight (00:00:00.000).
   * 
   * @param gc the {@link GregorianCalendar} instance from which the first day of the month will be calculated
   * @return a new {@link GregorianCalendar} instance representing the first day of the month at midnight
   */
  public static GregorianCalendar getFirstDateOfMonth(GregorianCalendar gc) {
      GregorianCalendar newGc = cloneCalendar(gc);
      newGc.set(GregorianCalendar.DAY_OF_MONTH, 1);
      return resetTime(newGc);
  }

  /**
   * Returns the last date of the month for the given {@link GregorianCalendar},
   * with the time reset to midnight (00:00:00.000).
   * 
   * @param gc the {@link GregorianCalendar} instance from which the last day of the month will be calculated
   * @return a new {@link GregorianCalendar} instance representing the last day of the month at midnight
   */
  public static GregorianCalendar getLastDateOfMonth(GregorianCalendar gc) {
      GregorianCalendar newGc = cloneCalendar(gc);
      newGc.set(GregorianCalendar.DAY_OF_MONTH, newGc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
      return resetTime(newGc);
  }

  /**
   * Returns the previous day for the given {@link GregorianCalendar},
   * with the time reset to midnight (00:00:00.000).
   * 
   * @param gc the {@link GregorianCalendar} instance for which the previous day will be calculated
   * @return a new {@link GregorianCalendar} instance representing the previous day at midnight
   */
  public static GregorianCalendar getPreviousDay(GregorianCalendar gc) {
      GregorianCalendar newGc = cloneCalendar(gc);
      newGc.add(GregorianCalendar.DATE, -1);
      return resetTime(newGc);
  }

  /**
   * Returns the next day for the given {@link GregorianCalendar},
   * with the time reset to midnight (00:00:00.000).
   * 
   * @param gc the {@link GregorianCalendar} instance for which the next day will be calculated
   * @return a new {@link GregorianCalendar} instance representing the next day at midnight
   */
  public static GregorianCalendar getNextDay(GregorianCalendar gc) {
      GregorianCalendar newGc = cloneCalendar(gc);
      newGc.add(GregorianCalendar.DATE, 1);
      return resetTime(newGc);
  }
}