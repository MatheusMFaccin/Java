/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios2;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
    private String nome;
    private String email;

    public Pessoa() {
        this.nome = "Matheus Faccin";
        this.email = "faccinmatheus@gmail.com";
    }
    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
