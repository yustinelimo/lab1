/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author lenovo
 */
public class javaLessonTesting {
    public static void main(String[] args) throws InvalidAgeException {
checkAge(12); 
    
    }  

    public static void checkAge(int age) throws InvalidAgeException {
        try {
            if (age < 18) {
                throw new InvalidAgeException("you have not attained voting age");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (InvalidAgeException ex) {
            System.err.println("You must be 18yrs old to vote");
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
            
    }

    public static class InvalidAgeException extends Exception {//custom exception a subclass of class exception

        public InvalidAgeException(String customMessage) {//instantiation of customessage below
            super(customMessage);//calls the superclass(exception) constructor
        }
    }
}
