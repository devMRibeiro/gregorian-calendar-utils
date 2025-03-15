# GregorianCalendarUtils

`GregorianCalendarUtils` is a utility class that provides some methods to manipulate and work with `GregorianCalendar` objects in Java. 
This class does not modify the original `GregorianCalendar` instances passed to its methods, instead returning new instances or resetting values when appropriate.

## Documentation
You can find the full Javadoc documentation for the GregorianCalendarUtils class <a href="https://devmribeiro.github.io/gregorian-calendar-utils/" target="_blank">here.</a>

## Features

- **Reset Time**: Reset the time of a `GregorianCalendar` to midnight (`00:00:00.000`).
- **First and Last Day of the Month**: Get the first and last days of the month for a given `GregorianCalendar`.
- **Previous and Next Day**: Retrieve the previous and next days for a given `GregorianCalendar`.
- **Conversion to and from `LocalDateTime`**: Convert between `GregorianCalendar` and `LocalDateTime` objects.

## Installation

No installation is required for this utility class. Simply include the `GregorianCalendarUtils.java` file in your project.

## Usage

You can use the utility methods provided by `GregorianCalendarUtils` in your project by calling them on a `GregorianCalendar` instance. Here is an example:

```
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        
        // Reset time to midnight
        GregorianCalendar gcMidnight = GregorianCalendarUtils.resetTime(gc);
        
        // Get the first day of the month
        GregorianCalendar firstDay = GregorianCalendarUtils.getFirstDateOfMonth(gc);
        
        // Get the last day of the month
        GregorianCalendar lastDay = GregorianCalendarUtils.getLastDateOfMonth(gc);
        
        // Get the previous day
        GregorianCalendar previousDay = GregorianCalendarUtils.getPreviousDay(gc);
        
        // Get the next day
        GregorianCalendar nextDay = GregorianCalendarUtils.getNextDay(gc);
        
        // Convert GregorianCalendar to LocalDateTime
        LocalDateTime localDateTime = GregorianCalendarUtils.toLocalDateTime(gc);
        
        // Convert LocalDateTime to GregorianCalendar
        GregorianCalendar newGc = GregorianCalendarUtils.fromLocalDateTime(localDateTime);
    }
}
```
