package org.example;

// This interface defines a contract for sending messages
public interface Message
{
    // This method sends a message with the specified content
    // Implementations of this interface must provide their own implementation of this method
    public void sendings(String message);
}