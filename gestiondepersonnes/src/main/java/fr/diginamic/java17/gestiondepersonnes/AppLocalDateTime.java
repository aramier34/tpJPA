package fr.diginamic.java17.gestiondepersonnes;

import java.time.*;
import java.time.format.*;

public class AppLocalDateTime {

	public static void main(String[] args) {
		// 2016-01-15T15:14:15.662+01:00[Europe/Paris]
		System.out.println(ZonedDateTime.now());
		
		//2016-07-02T16:52:25.374-04:00[America/Indiana/Indianapolis]
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Indiana/Indianapolis")));
		
		// Parser une date au format non ISO
		LocalDate result = LocalDate.parse("24/02/2017", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(result);
		
		// Afficher une date au format BASIC_ISO (chaine=" 20170224")
		System.out.println(result.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		// Afficher une date dans un format personnalisť (chaine="24/02/2017")
		System.out.println(result.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		Period period = Period.between(
				LocalDate.parse("20/06/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				LocalDate.parse("27/06/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				System.out.println(period.getDays());
	}

}
