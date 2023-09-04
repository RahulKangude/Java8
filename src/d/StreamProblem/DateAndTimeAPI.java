package d.StreamProblem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateAndTimeAPI {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd + "   " + mm + "   " + yy);
		// System.out.printf( "%d-%d-%d",dd,mm,yy);

		int hrs = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nano = time.getNano();
		// System.out.printf( " get time "+"%d:%d:%d:%d",hrs,min,sec,nano);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDateTime dt = LocalDateTime.of(1998, Month.AUGUST, 16, 1, 33);
		System.out.println(dt);

		System.out.println("after six month " + dt.plusMonths(4));

		// birthday
		LocalDate birthday = LocalDate.of(1998, Month.AUGUST, 16);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf(" your Age is-->> %d years %d Months %d Days", p.getYears(), p.getMonths(), p.getDays());

	}

}
