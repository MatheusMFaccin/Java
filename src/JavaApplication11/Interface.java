/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication11;

import java.util.Scanner;

/**
 *
 * @author facci
 */
public class Interface {
    public String str(){
        Scanner sc = new Scanner(System.in);
        String palavras = sc.nextLine();
        return palavras;
    }
    public double num(){
        Scanner sc = new Scanner(System.in);
        double  numero = sc.nextDouble();
        return numero;
    }
    
}
