package domain;
import java.util.List;

import domain.Usuario;

public class Professor extends Usuario implements IAvaliavel{
    private Integer matricula;
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
    
}