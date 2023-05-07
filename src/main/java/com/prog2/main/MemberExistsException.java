package com.prog2.main;

/**
 * @author Sunhwa Lee 
 *
 */
public class MemberExistsException extends Exception {
    
    public MemberExistsException(){
        super("ERR: Member already exists in the department!");
    }
    
    public MemberExistsException(String err){
        super(err);
    }

}
