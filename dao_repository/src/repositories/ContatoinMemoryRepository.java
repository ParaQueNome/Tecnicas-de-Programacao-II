package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.Contato;

public class ContatoinMemoryRepository implements IContatoRepository{
    private  List<Contato> contatos = new ArrayList<>();

    @Override
    public void salvar(Contato contato) {
        //TODO: validar contato
        contatos.add(contato);
    }

    @Override
    public void atualizar(Contato contato) {
        // TODO: validar contato
        this.contatos.stream()
        .filter(c -> c.getEmail().equals(contato.getEmail()))
        .findFirst()
        .ifPresent(c -> {
            c.setNome(contato.getNome());
            c.setTelefone(contato.getTelefone());
            c.setLinkedin(contato.getLinkedin());
        });
    }

    @Override
    public void excluir(Integer id) {
        this.contatos
        .stream()
        .filter(c -> c.getId()==id)
        .findFirst()
        .ifPresent(c -> this.contatos.remove(c));
    }

    @Override
    public List<Contato> buscarTodos() {
        return contatos;
    }

    @Override
    public Contato buscarPorEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorEmail'");
    }
    
}
