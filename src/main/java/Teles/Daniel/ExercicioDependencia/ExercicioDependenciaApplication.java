package Teles.Daniel.ExercicioDependencia;

import Teles.Daniel.ExercicioDependencia.model.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 13/06/2020 - 20:46
 * @category view
 */
@SpringBootApplication
public class ExercicioDependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExercicioDependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class) ;
		pet.executar();
	}

}
