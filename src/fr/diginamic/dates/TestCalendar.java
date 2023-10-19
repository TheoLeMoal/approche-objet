package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
        // Utilisation de la classe Calendar pour créer une instance de Date au 19 mai 2016 à 23h59:30
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date date1 = calendar1.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du 19 mai 2016 à 23h59:30 : " + format1.format(date1));

        // Utilisation de la classe Calendar pour créer une instance de Date à la date du jour
        Calendar calendar2 = Calendar.getInstance();
        Date date2 = calendar2.getTime();
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date du jour : " + format2.format(date2));

        // Affichage dans différentes langues
        Locale[] locales = {Locale.FRANCE, new Locale("ru", "RU"), Locale.CHINA, Locale.GERMANY};
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss", Locale.US);

        for (Locale locale : locales) {
            format3 = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss", locale);
            System.out.println("Date au format " + locale.getDisplayLanguage() + " : " + format3.format(date2));
        }
	}

}
