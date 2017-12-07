/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Lab1 {//outer class hosts the inner class below

    
    public static void main(String[] args) {
        //checkage(12);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input text to output: ");
        printer.printerout(scan.nextLine());
        try {
            String input = "is";//unchecked exception compiler might not complain
            int user_input = Integer.parseInt(input);

        } catch (Exception e) {//catching general exception vs specific listed after the program is run "numberformatException"
            System.out.println("invalid output ");
        }

    }

    public static class printer {//inner class i.e class within a class
        //class as a member of another class. used for more encapsulation in that
        //it can be declared as private 

        public static String printerout(String text) {
            System.out.println("Your text is " + text);
            return text;
        }
    }
}
