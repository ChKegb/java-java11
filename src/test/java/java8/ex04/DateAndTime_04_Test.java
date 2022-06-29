package java8.ex04;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 04 - LocalDateTime
 */
public class DateAndTime_04_Test {

    @Test
    public void test_localDateTime_of() {

        // TODO créer un objet LocalDateTime à la date heure 12h00m00s 01/01/2018
        LocalDateTime result = LocalDateTime.of(2018, 1, 1, 12, 0, 0);

        // TODO valoriser les différentes variables afin de rendre le test passant
        int hour = 0;
        int minutes = 0;
        int second = 0;
        int year = 0;
        Month month = null;
        int dayOfMonth = 0;
        
        result.getHour();
        result.getMinute();
        result.getSecond();
        result.getYear();
        result.getMonth();
        result.getDayOfMonth();
        
        
     
    }

    @Test
    public void test_localDateTime_parse() {

        // TODO créer un objet LocalDateTime à l'heure 2 mars 2009 à 09h30m00s à l'aide de la méthode parse
        LocalDateTime result = LocalDateTime.parse("2009-03-02T09:30:00");

        // TODO valoriser les différentes variables afin de rendre le test passant
        int hour = 0;
        int minutes = 0;
        int second = 0;

        int year = 0;
        Month month = null;
        int dayOfMonth = 0;
        
        result.getYear();
        result.getMonth();
        result.getDayOfMonth();
        result.getHour();
        result.getMinute();
        result.getSecond();

       
    }

    @Test
    public void test_localDateTime_format() {

        // TODO créer un objet LocalDateTime le 27/11/2017 à 12h00m00s
        // TODO utiliser la méthode of
        LocalDateTime localDateTime = LocalDateTime.of(2017, 11, 27, 12, 0, 0);

        // TODO Formatter l'heure pour que le test soit passant
        String result = "2017 - 11/27 12:00";

        localDateTime.parse(result);
        
    }
}
