/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10490858keoratileboase;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class ST10490858keoratileBoase {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Enter username as required
       Scanner scanner = new Scanner(System.in);
        String Username;

        while (true) {
            System.out.print("Please enter your Username: ");
            Username = scanner.nextLine();

            if (Username.contains("_") && Username.length() <= 5) {
                System.out.println("Username accepted " + Username);
                break;
            } else {
                System.out.println("Please re enter your Username you have entered a wrong format Username");
            }
        }
        
        //Enter password as required 
         Scanner Scanner = new Scanner(System.in);
         String password;
         
        
         boolean Digit = true;
         boolean SpecialChar = true;
         
        while (true) {
            System.out.print("Please enter your password ");
            password = scanner.nextLine();
          

            if (password.contains("hasUpperCase") && Digit && SpecialChar && password.length() <=8) {
                System.out.println("Password accepted!");
                break;
            } else {
                System.out.println("You have entered a wrong password plaese try again");
            }
        }

       
        
          

        System.out.print("Please enter your cellphone(e.g. +1 1234567890): ");
        String input = scanner.nextLine();

        if (cellPhoneNumber(input)) {
            System.out.println("You enetered a correct password: " + input);
        } else {
            System.out.println("You have entered a wrong password.");
        }

        scanner.close();
    }

    public static boolean cellPhoneNumber(String number) {
      //your number contained required format
        return number.contains("\\+\\d{1,3}\\s\\d{7,12}");
    }
}
    

    
    
