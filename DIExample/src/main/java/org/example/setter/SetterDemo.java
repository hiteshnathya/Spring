package org.example.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfiguration.class);
        AnimalControl animalControl =applicationContext.getBean(AnimalControl.class);
        System.out.println(animalControl.getAnimal());


    }
}
