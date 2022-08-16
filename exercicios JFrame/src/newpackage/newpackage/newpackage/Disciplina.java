/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.newpackage.newpackage;

/**
 *
 * @author laboratorio
 */
public class Disciplina {
    private String nome;
    private String nomeprofessor;
    private int cargahoraria;

    public Disciplina(String nome, String nomeprofessor, int cargahoraria) {
        this.nome = nome;
        this.nomeprofessor = nomeprofessor;
        this.cargahoraria = cargahoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeprofessor() {
        return nomeprofessor;
    }

    public void setNomeprofessor(String nomeprofessor) {
        this.nomeprofessor = nomeprofessor;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    
    
}
