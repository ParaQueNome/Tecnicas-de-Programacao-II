package domain;
import java.util.ArrayList;
import java.util.List;

import domain.Usuario;

public class Professor extends Usuario implements IAvaliavel{
    private Integer matricula;
    private List<Aluno> alunos = new ArrayList<>();
    public Professor(String nome, String email, String telefone, String github, Integer matricula) {
        super(nome, email, telefone, github);
        this.matricula = matricula;


        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        String retorno = super.toString().concat("\n Matricula:").concat(matricula.toString());
        return retorno;

    }
    @Override
    public void autenticar(String username, String senha) {
        System.out.println("Professor autenticado com sucesso");
    }
    @Override
    public void aplicarAvaliacao(List<Aluno> alunos){
        alunos.forEach(a -> System.out.println("Aluno " + a));
    }

    public void ensina(Curso curso){
        System.out.printf("Lecionando no curso: %s", curso.getNome());
        for(Aluno a: alunos){
            a.assimilar(curso.getConhecimento());
        }
    }
    public List<Aluno> getAlunos(){
        return alunos;
    }
    public void setAlunos(Aluno e){
        alunos.add(e);
    }
    
}