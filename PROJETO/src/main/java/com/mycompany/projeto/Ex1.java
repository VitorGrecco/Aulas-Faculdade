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
public class Ex1 {
    public static void main (String[]args)
            
    {
        float cotDolar, qtDolar, real;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor cotação Dolar: ");
        cotDolar = sc.nextFloat();
        
        System.out.print("Quantidade de Dolar: ");
        qtDolar = sc.nextFloat();
        
        real = cotDolar * qtDolar;
        System.out.println(" Real R$: " + real);
        
   }
}