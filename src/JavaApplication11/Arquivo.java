/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author facci
 */
public class Arquivo {
    private String nomeArquivo;
    private String nomeusuario;
    private String senha;
    private double valor;
    private String nomemoeda;

    public Arquivo(String nomeArquivo, String nomeusuario, String senha, double valor, String nomemoeda) {
        this.nomeArquivo = nomeArquivo;
        this.nomeusuario = nomeusuario;
        this.senha = senha;
        this.valor = valor;
        this.nomemoeda = nomemoeda;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomemoeda() {
        return nomemoeda;
    }

    public void setNomemoeda(String nomemoeda) {
        this.nomemoeda = nomemoeda;
    }
    

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    public void criararquivo(){
        File arquivo = new File(this.nomeArquivo);
        try {
            if(arquivo.createNewFile()){
                System.out.println("arquivo criado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void escreverarquivo(){
        try {
            FileWriter fw = new FileWriter(this.nomeArquivo);
            fw.write("nome do usuario: "+this.nomeusuario+"\n"+"senha: "
                    +this.senha+"\n"+"nome da moeda: "+this.nomemoeda
                    +"\n"+"valor da moeda: "+this.valor);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
