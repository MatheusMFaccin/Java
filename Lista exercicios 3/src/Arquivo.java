
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author facci
 */
public class Arquivo {

    public static void criarArquivo(String caminho, String texto) {
        try {
            File file = new File(caminho);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                escreverArquivo(caminho, texto);
            } else {
                escreverArquivo(caminho, texto);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void escreverArquivo(String caminho, String texto) {
        try {
            FileWriter myWriter = new FileWriter(caminho);
            myWriter.write(texto);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static String lerArquivo(String caminho) {
        String data = "";
        try {
            File myObj = new File(caminho);
            Scanner myReader = new Scanner(myObj);
            
            while (myReader.hasNextLine()) {
                data = data+myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
       
        return data;
    }
}

