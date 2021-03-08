package semifir;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import semifir.batiment.OpenSpace;
import semifir.batiment.Restaurant;
import semifir.chef.Chef;
import semifir.entreprise.Entreprise;

@Configuration
public class EntrepriseConfiguration {

	@Bean
	public Entreprise restaurantFactory(Chef chef, Restaurant restaurant) {
		return new Entreprise("MonRestaurant", chef, restaurant);
	}
	
	@Bean
	public Entreprise informatiqueFactory(Chef chef, OpenSpace openspace) {
		return new Entreprise("MonEntrepriseIT", chef, openspace);
	}
	
	@Bean
	public String nom() {
		return "MonBureau";
	}
}
