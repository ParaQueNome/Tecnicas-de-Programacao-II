package domain;

public class Contato {
    //TODO: Criar os atributos da classe Contato [id, nome, email, telefone, linkedin]
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String linkedin;
    public int getId() {
        return id;
    }
    //TODO: Criar os Getters, Setters e ToString();
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getLinkedin() {
        return linkedin;
    }
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    //TODO: Criar construtores
    public Contato(int id, String nome, String email, String telefone, String linkedin) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.linkedin = linkedin;
    }
    public Contato() {
        }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
    
    
    //TODO: Criar hashCode() e equals() com base no id;
   


}
