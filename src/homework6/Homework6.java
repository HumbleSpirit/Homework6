/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;

import java.util.Scanner;

/**
 *
 * @author sergey
 */
public class Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menuChoice = 0;
        double calcValue1 = 0;
        double calcValue2 = 0;
        
        System.out.println("Task 1");
        System.out.println("Simple calc with do-while");
        Scanner in = new Scanner(System.in); 
        do
            {
                System.out.println("Please enter desired action\n 1 - Addition \n 2 - Substraction \n 3 - Multiplication \n 4 - Division");
                menuChoice = in.nextInt(); 

                if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4 )
                {
                System.out.println("Please enter first fractional number");
                calcValue1 = in.nextDouble();  
                System.out.println("Please enter second fractional number");
                calcValue2 = in.nextDouble();
        
                switch(menuChoice)
                    {
                    case 1:
                        System.out.println("Summ of two values is " + (calcValue1 + calcValue2));
                        break;

                    case 2:
                        System.out.println("Substraction of two values is " + (calcValue1 - calcValue2));
                        break;

                    case 3:
                        System.out.println("Multiplication of two values is " + (calcValue1 * calcValue2));
                        break;

                    case 4:
                        System.out.println("Division of two values is " + (calcValue1 / calcValue2));
                        break;
                    }
                }
            }
        while ((menuChoice <= 4) && (menuChoice > 0));
        System.out.println("Please enter correct number\n");
        
        
        
        System.out.println("Task 4");
        System.out.println("Display multiplication table");
        
        for (int i = 0; i <= 10; i++) 
        {
            for (int j = 0; j <= 10; j++) 
            {
                if (i > 0 && j > 0)
                {
                    System.out.print(i*j + "\t");
                }
                
            }
           System.out.println(" ");
        }
        
        
    }
    
}