package TD5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Promotion {
	final LocalDate debutPromo=LocalDate.of(2022, 3, 19);
	final LocalDate finPromo=LocalDate.of(2022,3, 31);
	
	//
	float prixDeVente(String dateStr);
	
	default boolean estPeriodePromo(String dateStr) {
		LocalDate dateAchat = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return (dateAchat.isEqual(debutPromo) || dateAchat.isAfter(debutPromo))
                && (dateAchat.isEqual(finPromo) || dateAchat.isBefore(finPromo));
        //ne retourne true que lorsque la date égale à ses 4 cas
	}
	abstract double calculerRemise(double prixAvantRemise, double prixApresRemise);
		
	
	
	
}
