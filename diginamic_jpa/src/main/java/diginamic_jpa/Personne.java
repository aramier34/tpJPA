package diginamic_jpa;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Personne {

	@Id
	private long id;
	private String nom;
	private String pr?nom;
	private String t?l?phone;
	private Genre genre;
	private LocalDate dateNaissance;
	private boolean actif=true;

}
