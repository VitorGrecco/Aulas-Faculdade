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
public class Ex3 {
    
    public static void main (String[]args) 
            
    {
    double precoUnit, qtdeVenda, comissao;
    
    Scanner sc = new Scanner(System.in);
    
    precoUnit = sc.nextDouble();
    qtdeVenda = sc.nextDouble();
    
    comissao = (precoUnit * qtdeVenda)*0.05;
    
    System.out.print(" comissao: " + comissao);
    }
    
}
