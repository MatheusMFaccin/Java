
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Aluno {
    private String nome;
    private String curso;
    ArrayList <Aluno> aluno = new ArrayList<Aluno>(); 

  
    
    
    
    public void mostrarlista(ArrayList<Aluno> l){
        for(Aluno i : l){
            System.out.println(i.nome+""+i.curso+"\n");
        }
        
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
