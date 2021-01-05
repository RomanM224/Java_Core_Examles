package DateExample;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local date: " + localDate + "\n");
        
        localDate =  LocalDate.of(2015, 02, 20);
        System.out.println("Date of: " + localDate + "\n");
        
        localDate = LocalDate.parse("2015-02-20");
        System.out.println("Parse date: " + localDate + "\n");
        
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow date: " + tomorrow + "\n");
        
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Previous month same day date: " + previousMonthSameDay + "\n");
        
        DayOfWeek day = LocalDate.parse("2016-06-11").getDayOfWeek();
        System.out.println("Get day of parse date: " + day + "\n");

        Integer days =  LocalDate.parse("2016-06-11").getDayOfMonth();
        System.out.println("Get day of month of parse date: " + days + "\n");
        
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("Is now year is leap year: " + leapYear + "\n");
        
        leapYear = LocalDate.parse("2016-04-03").isLeapYear();
        System.out.println("Is 2016 year is leap year: " + leapYear + "\n");
        
        boolean isBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
        System.out.println("Is before 2016-06-12 than 2016-06-11: " + isBefore + "\n");
        
        boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
        System.out.println("Is before 2016-06-12 than 2016-06-11: " + isAfter + "\n");
        
        LocalTime now = LocalTime.now();
        System.out.println("Local time now: " + now + "\n");
        
        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println("Parse local time: " + sixThirty + "\n");
        
        sixThirty = LocalTime.of(6, 30);
        System.out.println("Parse local time: " + sixThirty + "\n");
        
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println("06:30 plus one hour: " + sevenThirty + "\n");
        
        isBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println("Is before 06:30 than 07:30: " + isBefore + "\n");
        
        LocalTime maxTime = LocalTime.MAX;
        System.out.println("Max time: " + maxTime + "\n");

        System.out.println("Local date time now: " + LocalDateTime.now() + "\n");
        
        System.out.println("Local date time of: " + LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30) + "\n");
        
        System.out.println("Local date time of: " + LocalDateTime.parse("2015-02-20T06:30:00") + "\n");

        LocalDateTime localDateTime = LocalDateTime.now().plusDays(1);
        System.out.println("Local date time plus 1 day: " + localDateTime + "\n");
        
        localDateTime = LocalDateTime.now().minusHours(2);
        System.out.println("Local date time minus 2 hours: " + localDateTime + "\n");
        
        Month month = LocalDateTime.now().getMonth();
        System.out.println("Get now month: " + month + "\n");
 
        
        //Period works with date, Duration working with time
        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println("Initial date: " + initialDate + " " + "Final date: " +finalDate + "\n");
        
        int betweenDays = Period.between(initialDate, finalDate).getDays();
        System.out.println("Pediod between initialDate and final date: " + betweenDays + " days" + "\n");
        
        long betweenDay = ChronoUnit.DAYS.between(initialDate, finalDate);
        System.out.println("Pediod between initialDate and final date: " + betweenDay + " days" + "\n");
        
        
        //Period works with date, Duration working with time
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        System.out.println("Time before: " + initialTime + " time afte: " + finalTime + "\n");
        
        long thirty = Duration.between(initialTime, finalTime).getSeconds();
        System.out.println("Second between initial time and final time is: " + thirty + "\n");
        
        LocalDateTime localDateTime1 = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        String localDateString = localDateTime1.format(DateTimeFormatter.ISO_DATE);
        System.out.println(localDateString + "\n");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'_'HH:mm:ss.SSS");
        LocalDateTime localDateT = LocalDateTime.parse("2018-05-24_12:02:58.917", formatter);
        System.out.println(localDateT);
        
        
        
        
    }

}
