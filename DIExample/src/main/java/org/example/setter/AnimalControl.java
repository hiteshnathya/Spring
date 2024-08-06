package org.example.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalControl {
    private Animal animal;
    @Autowired
    @Qualifier("cat")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public String getAnimal() {
        return animal.speaks();
    }

}
