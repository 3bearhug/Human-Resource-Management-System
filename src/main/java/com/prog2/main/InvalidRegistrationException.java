package com.prog2.main;

/**
 * @author Sunhwa Lee
 *
 */
public class InvalidRegistrationException extends Exception {
    
    public InvalidRegistrationException(){
        super("ERR: Invalid Registration!");
    }
    
    public InvalidRegistrationException(String err){
        super(err);
    }
}

