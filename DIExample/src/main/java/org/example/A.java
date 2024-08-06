package org.example;

// Import the @Service annotation from the Spring Framework
import org.springframework.stereotype.Service;

// Annotate the class with the @Service annotation,
// which marks this class as a Spring Service component.
// The string "A" is the name of the service.
@Service("A")

// This class implements the Message interface
public class A implements Message
{
    // This method sends a message
    public void sendings(String message)
    {
        // Print the message to the console
        System.out.println("This is A class sending" + message);
    }
}