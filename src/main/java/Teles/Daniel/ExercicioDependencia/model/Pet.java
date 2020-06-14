package Teles.Daniel.ExercicioDependencia.model;

import Teles.Daniel.ExercicioDependencia.interfaces.AnimalIterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 13/06/2020 - 20:40
 * @category model
 */
@Component
@Primary
public class Pet {

    @Autowired
    private AnimalIterface animalIterface;

    public void executar() {
        animalIterface.comunicar();

    }
}
