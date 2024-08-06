package org.example;

// Import the @Autowired annotation from the Spring Framework
import org.springframework.beans.factory.annotation.Autowired;

// Import the @Qualifier annotation from the Spring Framework
import org.springframework.beans.factory.annotation.Qualifier;

// Import the @Component annotation from the Spring Framework
import org.springframework.stereotype.Component;

// This class is a Spring component
@Component

// This class demonstrates constructor-based dependency injection
public class ConstructorBased
{
    // This field will hold a reference to a Message object
    private Message message;

    // Use constructor-based dependency injection to inject a Message object
    // The @Autowired annotation tells Spring to inject the dependency
    // The @Qualifier annotation specifies the name of the bean to inject
    @Autowired
    public ConstructorBased(@Qualifier("A") Message message) {
        // Call the superclass constructor (not necessary in this case, but good practice)
        super();
        // Set the message field to the injected Message object
        this.message = message;
    }

    // This method receives a message and sends it using the injected Message object
    public void receiving(String message) {
        // Send the message using the injected Message object
        this.message.sendings("message");
    }
}