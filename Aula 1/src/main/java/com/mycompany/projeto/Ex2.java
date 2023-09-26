/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author 82019247
 */
public class Ex2 {
    
     public static void main (String[]args)
     
     {
     
         float num1, num2, num3, num4, result; 
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Numero 1: ");
         num1 = sc.nextFloat();
         
         System.out.print("Numero 2: ");
         num2 = sc.nextFloat();
         
         System.out.print("Numero 3: ");
         num3 = sc.nextFloat();
         
         System.out.print("Numero 4: ");
         num4 = sc.nextFloat();
         
         result = num1 * num1 + num2 * num2 + num3 * num3 + num4 * num4;
         System.out.println(" Resultado: " + result);
         
         sc.close();
     
     }
}
