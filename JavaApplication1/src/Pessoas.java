
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author laboratorio
 */
public class Pessoas {

    private String nome;
    private String sobrenome;
    private String email;
    private int telefone;
    private int cpf;
    private String cidade;
    private String nascionalidade;
    private int idade;
    private String sexo;
    private String vagasdesejada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVagadesejada() {
        return vagasdesejada;
    }

    public void setVagadesejada(String vagadesejada) {
        this.vagasdesejada = vagadesejada;
    }

    public Pessoas(String nome, String sobrenome, String email, int telefone,
            int cpf, String cidade, String nascionalidade, int idade,
            String sexo, String vagadesejada) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cidade = cidade;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.sexo = sexo;
        this.vagasdesejada = vagadesejada;
    }

    public void motrarPessoa() {
        JOptionPane.showMessageDialog(null, "\nnome: " + this.nome + "\nsobrenome: "
                + this.sobrenome + "\nemail: " + this.email + "\ntelefone: " + this.telefone
                + "\ncpf: " + this.cpf + "\ncidade "
                + this.cidade + "nascionalidade: " + this.nascionalidade
                + "\nidade: " + this.idade + "\nsexo: " + this.sexo
                + "\nvagas desejadas: " + this.vagasdesejada);
    }

    
    
}
