package com.siyar.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("input number!");
            int result = sc.nextInt();
            System.out.println("You picked: " +result);
        } while(true);


    }
}





//instanstiera: Skapa ett objekt
//skift + tab: flytta kod till höger.
//nextLine tar in allting vi gör.



 /*System.out.println("Please insert a random sentence");
         sc.nextLine();

         System.out.println("This is unrelated");
         sc.nextLine(); */

//scanner(); //Kalla på metoden



/*Do och while är bra om man vill att den ska köras en gång även om det är False.
do {
        System.out.println("Did this run once");
        }
        while (false); */