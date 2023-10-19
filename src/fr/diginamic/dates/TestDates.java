package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
        // Créer une instance de Date à la date du jour
        Date dateDuJour = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        String date1 = format1.format(dateDuJour);
        System.out.println("Date du jour : " + date1);

        // Créer une instance de Date à la date du 19/05/2016 à 23:59:30
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String date2Str = "2016/05/19 23:59:30";
        try {
            Date date2 = format2.parse(date2Str);
            System.out.println("Date du 19/05/2016 à 23:59:30 : " + format2.format(date2));
        } catch (Exception e) {
            System.err.println("Erreur de parsing de la date 19/05/2016 à 23:59:30");
        }

        // Créer une instance de Date contenant la date/heure système
        Date dateSysteme = new Date();
        System.out.println("Date/heure système : " + format2.format(dateSysteme));
    }

}
