
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Ordena {
    public void mostrarlista(ArrayList<Aluno> l){
        /*for(int i = 0;  i < l.size(); i++){
            System.out.println(l.get(i)+"\n");
            
        }*/
        for(Aluno i : l){
            System.out.println(i.getNome()+" "+i.getCurso()+"\n");
        }
        
    }
    public void ordenar(ArrayList<Aluno> l){
        ArrayList<Aluno> j = l;
        Aluno tmp;
        for(int i=0;i<l.size();i++){
            
            if(j.get(i).getCurso()>j.get(i+1).getCurso())
            {
              tmp = l.get(i);
              l.set(i, l.get(i+1));
              l.set(i+1, tmp);
                
            }
        }
        
        /*for(String i: listaAluno){
            texto = texto + i + "\n";
        }
        jTextArea.setText(texto);*/
    }
    
}
