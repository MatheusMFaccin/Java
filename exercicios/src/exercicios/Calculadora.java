/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author laboratorio
 */
public class Calculadora {
    int num1;
    int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int soma(){
        return this.num1+this.num2;
    }
    public int sub(){
        return this.num1-this.num2;
    }
    public int div(){
        return this.num1/this.num2;
    }
    public int mult(){
        return this.num1*this.num2;
    }
    
}
