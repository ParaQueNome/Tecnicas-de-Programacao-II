package services;

import java.util.List;
import java.util.Objects;

import domain.ContatoVO;
import repositories.IContatoRepository;

public class ContatoService implements IContatoService {
    private final IContatoRepository repository;

    public ContatoService(IContatoRepository repository){
        this.repository = repository;
    }
    @Override
    public void salvar(ContatoVO contato) {
      
        if(Objects.isNull(contato.getNome()) || contato.getNome().isEmpty()){
            throw new RuntimeException("Nome é obrigatório");
        }
        if(Objects.isNull(contato.getEmail()) || contato.getEmail().isEmpty()){
            throw new RuntimeException("Email é obrigatório");
        }

        repository.salvar(contato);
         
    }

    @Override
    public void alterar(ContatoVO contato) {
        
        
        //TODO: Validar objeto conforme a entidade contatos
        if(Objects.isNull(contato.getId())){
            throw new RuntimeException("Não cadastrado");
        }else{
            //TODO: Consultar e recuperar contato
            contato.stream()
                
            } 
        }
        

        //TODO: Alterar contato
    }

    @Override
    public ContatoVO buscaPorEmail(String email) {
        
        throw new UnsupportedOperationException("Unimplemented method 'buscaPorEmail'");
        //TODO: Validar email

        //TODO: Localizar contato e retornar contato
    }

    @Override
    public void excluir(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
        //TODO: Validar id

        //TODO: Localizar contato e excluir
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        // TODO Auto-generated method stub
        return repository.buscarTodos();
    }
    
}
