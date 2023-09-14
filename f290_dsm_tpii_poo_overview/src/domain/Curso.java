package domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<String> conhecimentos = new ArrayList<>();
   
    // Incluindo a Lista no método construtor
    public Curso(String nome, List<String> conhecimentos) {
        this.nome = nome;
        this.conhecimentos = conhecimentos;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public List<String> getConhecimento(){
        return conhecimentos;
    }
}
