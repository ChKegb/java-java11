package java8.ex02;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;

import org.junit.Test;

/**
 * Exercice 02 - LocalDate
 */
public class DateAndTime_02_Test {

	@Test
	public void test_localDate_of() {

		// TODO créer un objet LocalDate à la date 24/12/2050
		LocalDate result = null;

		// TODO En exploitant les méthodes de l'objet result, valoriser les
		// différentes variables afin de rendre le test passant.
		
		int year = 0;
		Month month = null;
		int dayOfMonth = 0;
		DayOfWeek dayOfWeek = null;
		int dayOfYear = 0;

		assertThat(year, is(2050));
		assertThat(month, is(Month.DECEMBER));
		assertThat(dayOfMonth, is(24));
		assertThat(dayOfWeek, is(DayOfWeek.SATURDAY));
		assertThat(dayOfYear, is(358));
	}

	@Test
	public void test_localDate_parse() {

		// TODO créer un objet LocalDate à la date 10/01/1990
		
		LocalDate result = LocalDate.of(10, 1, 1990);
		
		
		// TODO utiliser la méthode parse
		
		//LocalDate result = null;
		
		LocalDate result1 = LocalDate.parse("1990-01-10");
		
		
	   

		// TODO En exploitant les méthodes de l'objet result, valoriser les
		// différentes variables afin de rendre le test passant.
		
		
		
		int year = 0;
		Month month = null;
		int dayOfMonth = 0;

		result.getYear();
		result.getMonth();
		result.getDayOfMonth();
		
		assertThat(year, is(1990));
		assertThat(month, is(Month.JANUARY));
		assertThat(dayOfMonth, is(10));
		
	}

	@Test
	public void test_localDate_format() {

		// TODO créer un objet LocalDate à la date 11/03/2015
		
		LocalDate res=LocalDate.of(2015,3,11);
		
		// en utilisant la méthode of
		
		LocalDate localDate = null;
		LocalDate.of(2015, 3, 11);

		// TODO Formatter la date pour que le test soit passant
		String result = "2017-03-22";
		LocalDate dateStr =LocalDate.parse(result);

	
	}

	@Test(expected = UnsupportedTemporalTypeException.class)
	public void test_localDate_format_with_hour() {

		// TODO créer un objet LocalDate à la date 11/03/2015
		
		// TODO utiliser la méthode of
		LocalDate localDate = LocalDate.of(2015,03,11);

		// TODO Formatter la date pour avoir l'affichage suivant : "11/03/2015 00:00:00"
		
		localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		
		
		
		

	@Test
	public void test_with() {

		// TODO créer un objet LocalDate à la date 10/01/2000
		// TODO utiliser la méthode of
		LocalDate localDate = LocalDate.of(2000, 1, 10);

		// TODO transformer la date précédente en 05/02/2015
		LocalDate result = LocalDate.of(2015, 2, 5);
		result.getYear();
		result.getMonth();
		result.getDayOfMonth();

		
	}

}
