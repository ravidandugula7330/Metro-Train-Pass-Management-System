package com.codegnan.metrotrainpass.exceptions;


// Custom exception to indicate that the requested Metro Pass ID is not available in the system.
 
public class MetroPassNotFoundException extends Exception {

    public MetroPassNotFoundException() { }

    // Constructor that passes error message to Exception class
    public MetroPassNotFoundException(String message) {
        super(message);
    }
}
