
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author laboratorio
 */
public class Arquivo {

    public void escreverArquivo(String nome, String sobrenome, String email,
            int telefone, int cpf, String cidade, String nascionalidade, int idade, String sexo,
            String vagas) throws IOException {

        FileWriter myWriter = new FileWriter("candidatos.txt",true);
        myWriter.write("\n\nnome: " + nome + "\nsobrenome: "
                + sobrenome + "\nemail: " + email + "\ntelefone: " + telefone
                + "\ncpf: " + cpf + "\ncidade "
                + cidade + "\nnascionalidade: " + nascionalidade
                + "\nidade: " + idade + "\nsexo: " + sexo
                + "\nvagas desejadas: " + vagas);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    }
}
