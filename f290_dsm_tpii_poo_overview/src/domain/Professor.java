package domain;
import domain.Usuario;

public class Professor extends Usuario {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticar'");
    }
    
    
}