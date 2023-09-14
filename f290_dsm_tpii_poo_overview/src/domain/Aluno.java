package domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{
    private Integer ra;
    private List<String> conhecimentos = new ArrayList<>();
    public Aluno(String nome, String email, String telefone, String github, Integer ra){
        super(nome, email, telefone,github);
        this.ra = ra;
    }
    @Override
    public String toString() {
        String retorno = super.toString().concat("\n Ra:").concat(ra.toString());
        return retorno;
    }
    @Override
    public void autenticar(String username, String senha) {
        System.out.println("Aluno autenticado com sucesso");
    }
    public void assimilar(List<String> conhecimentos){
        this.conhecimentos = conhecimentos;
    }
    
}
