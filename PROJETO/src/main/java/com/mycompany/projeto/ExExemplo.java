/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author 82019247
 */
public class ExExemplo {

    public static void main(String[] args) 
    {
      int num1;
      int num2; 
      int result;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Num1 - ");
      num1 = sc.nextInt();
      System.out.println("Num2 - ");
      num2 = sc.nextInt();
      
      result = num1 + num2; 
      
      System.out.println(" Resultado: " + result);
    }
}
