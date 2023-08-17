package domain;
public class App {
    public static void main(String[] args) throws Exception{
        

        Contato contato = new Contato();

        contato.nome = "Pedro";
        contato.telefone = "telefone";
        contato.github = "github";
        contato.setEmail("pedro@gmail.com");

        Contato contato1 = new Contato();
        contato1.nome = "Jonas";
        contato1.telefone = "telefone";
        contato1.github = "github";
        contato1.setEmail("thiagogmail.com");

        contato.exibirDados();
        contato1.exibirDados();
        

        

    }
}
