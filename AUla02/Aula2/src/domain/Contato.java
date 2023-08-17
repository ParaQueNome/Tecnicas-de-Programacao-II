package domain;
public class Contato {
    // Atributos: nome, cpf, telefone, email
    public  String nome;
    public  String telefone;
    public  String github;
    private  String email;
    


    //Comportamentos
    public void exibirDados(){
        this.getEmail();
        System.out.printf( "Nome: %s\nTelefone: %s\nGithub: %s\nEmail: %s\n", nome, telefone, github, email);
        System.out.println();
    
    }

    public void setEmail(String email) {
        if(!email.contains("@") || !email.contains(".")){
            System.out.println("Email invalido");
            email = null;
            return;
        }
        this.email = email;

    }
    public String getEmail() {
        if(email == null || email.isEmpty()){
            email = "Email não cadastrado";
        }
        return email;
    }
}
