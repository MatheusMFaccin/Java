package JavaApplication11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author facci
 */
public class aprendendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface inter = new Interface();
        
        System.out.println("digite o seu nome ");
        String nome = inter.str();
        System.out.println("digite sua senha");
        String senha = inter.str();
        System.out.println("digite o valor da moeda");
        double valor = inter.num();
        System.out.println("digite o nome da moeda ");
        String moedanome = inter.str();
        System.out.println("digite o nome do arquivo");
        String nomeArquivo = inter.str();
        Moeda moeda = new Moeda(valor,moedanome);
        Usuario usuario = new Usuario(nome,senha);
        
        moeda.mostrarmoeda();
        usuario.mostrarusuario();
        Arquivo arquivo = new Arquivo(nomeArquivo,
                usuario.getNome(),
                usuario.getSenha(),
                moeda.getValor(),
                moeda.getNome());
        
        arquivo.criararquivo();
        arquivo.escreverarquivo();
        
    }
    
}
