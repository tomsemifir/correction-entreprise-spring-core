package semifir.entreprise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import semifir.batiment.Batiment;
import semifir.chef.Chef;

@Component
@Primary
@Scope("prototype")
public class Entreprise {

	public String nom;
	public Chef chef;
	public Batiment batiment;
	
	public Entreprise(String nom, Chef chef, @Qualifier("bureau") Batiment batiment) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.batiment = batiment;
	}

	@Override
	public String toString() {
		return "Entreprise [nom=" + nom + ", chef=" + chef + ", batiment=" + batiment + "]";
	}
}
