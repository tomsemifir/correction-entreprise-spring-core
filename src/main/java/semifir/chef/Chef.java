package semifir.chef;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chef {

	@Value("Mr.")
	public String nom;
	@Value("Manager")
	public String prenom;
	
	public Chef() {}

	@Override
	public String toString() {
		return "Chef [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
