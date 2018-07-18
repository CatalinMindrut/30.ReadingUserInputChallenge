package com.Catalin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true){ //This results in an endless loop because true is always true
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt(); //Verifies that the input is an int data type

            //Next we set up the conditions, what will happen if it is an int and what if it isn't
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }



}
