package org.example;

// Import the @Configuration annotation from the Spring Framework
import org.springframework.context.annotation.Configuration;

// Import the @ComponentScan annotation from the Spring Framework
import org.springframework.context.annotation.ComponentScan;

// This class is a Spring configuration class
@Configuration

// Enable component scanning for the specified package
@ComponentScan("org.example")

// This class is the main application configuration
public class AppConfiguration
{
    // This class is empty, but it's used by Spring to configure the application
}