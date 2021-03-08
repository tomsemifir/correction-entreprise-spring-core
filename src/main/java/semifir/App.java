package semifir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import semifir.entreprise.Entreprise;

@Configuration
@ComponentScan("semifir")
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Entreprise entreprise = context.getBean(Entreprise.class);
		System.out.println(entreprise);
		
		Entreprise restaurant = (Entreprise) context.getBean("restaurantFactory");
		System.out.println(restaurant);
		
		Entreprise it = (Entreprise) context.getBean("informatiqueFactory");
		System.out.println(it);
	}

}
