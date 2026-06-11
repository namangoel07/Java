package LectureTwelevePointFive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LaunchDate2 {
public static void main(String[] args)
{
	LocalDate date=LocalDate.now();
	System.out.println(date);
	int dayofMonth=date.getDayOfMonth();
	System.out.println(dayofMonth);
	int dayofYear=date.getDayOfYear();
	System.out.println(dayofYear);
	int month=date.getMonthValue();
	System.out.println(month);
	int year=date.getYear();
	System.out.println(year);
	LocalDate dob=LocalDate.of(2005, 01, 10);
	System.out.println(dob);
	System.out.println("**************");
	LocalTime time=LocalTime.now();
	System.out.println(time);
	int hour=time.getHour();
	int minutes=time.getMinute();
	int sec=time.getSecond();
	int nano=time.getNano();
	System.out.println(hour);
	System.out.println(minutes);
	System.out.println(sec);
	System.out.println(nano);
	System.out.println("***************");
	LocalDateTime td=LocalDateTime.now();
	System.out.println(td);
}
}
