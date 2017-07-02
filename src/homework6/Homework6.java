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
        int positiveCounter = 0;
        int negativeCounter = 0;
        int checkedNumber = 0;
        int odd_evenValue = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        int zeroCounter = 0;
        int starsNumber = 0;
        
        
        Scanner in = new Scanner(System.in); 
       /* System.out.println("Task 1");
        System.out.println("Simple calc with do-while");
        
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
        
        System.out.println("Task 2");
        System.out.println("Calculate percents of positive, negative and zeroes from entered 10 numbers");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Please enter number");
            calcValue1 = in.nextDouble();  
            if (calcValue1 > 0)
                {
                    positiveCounter++;
                }
            else if (calcValue1 < 0)
                {
                    negativeCounter++;
                }
            else
                {
                    zeroCounter++;
                }
        }
        System.out.println("Total positive numbers is " + (((positiveCounter*100)/10)) + " percents"
                + "\n" + "\nTotal negative numbers is " + (((negativeCounter*100)/10)) + " percents"
                        + "\n" + "\nTotal zero values is " + (((zeroCounter*100)/10))+ " percents\n");
        
        
           System.out.println("Task 3");
        System.out.println("Calculate percents of even and odd numbers from entered 10 numbers");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Please enter number");
            odd_evenValue = in.nextInt();  
            if (odd_evenValue % 2 != 0)
                {
                    oddCounter++;
                }
            else
                {
                    evenCounter++;
                }
        }
        System.out.println("Total odd numbers is " + (((oddCounter*100)/10)) + " percents"
                + "\n" + "\nTotal even numbers is " + (((evenCounter*100)/10)) + " percents");
                
        
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
        
        System.out.println("Task 5");
        System.out.println("Display prime numbers range to 100");
            
        for(int i = 2; i < 100; i++)
            {
            boolean numberToCheck= true;    

            for(int j = 2; j < i ; j++)
               {
                    if(i % j == 0)
                        {
                            numberToCheck = false;
                            break;
                        }
                }
                if(numberToCheck == true)
                    {
                        System.out.print(i + " ");
                    }
            }
        System.out.print("\n");
       
        System.out.println("Task 6");
        System.out.println("Display square with desired number of stars");
        starsNumber = in.nextInt();
        for (int i = 0; i < starsNumber; i++) 
            {
                
                for (int j = 0; j < starsNumber; j++) 
                {
                    System.out.print(" * ");
                }
                System.out.println("");
            }*/
        
    }
}
        
    

    
    

