package Teles.Daniel.ExercicioDependencia.model;

import Teles.Daniel.ExercicioDependencia.interfaces.AnimalIterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 13/06/2020 - 20:37
 * @category model
 */
@Component
@Qualifier("gato")
public class Gato implements AnimalIterface {

    @Override
    public void comunicar() {
        System.out.println("Miau");
    }
}
