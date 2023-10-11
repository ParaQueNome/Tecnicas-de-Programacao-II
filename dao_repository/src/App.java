import java.sql.ResultSet;
import java.util.List;

import dao.factories.ConexaoFactory;
import dao.factories.ContatoMySqliDAO;
import dao.factories.IContatoDAO;
import domain.ContatoVO;
import repositories.ContatoMySqlRepository;
import repositories.ContatoinMemoryRepository;
import repositories.IContatoRepository;
import services.ContatoService;
import services.IContatoService;

import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        //Connection conexao = ConexaoFactory.getConexao();
        //IContatoDAO dao = new ContatoMySqliDAO(conexao);
        IContatoRepository repository = new ContatoinMemoryRepository();

        IContatoService service = new ContatoService(repository);

        //TODO: Criar objeto COntatoVO e realizar chamada do metodo salvar do service.

        ContatoVO c1 = new ContatoVO(
        null, 
        "Joao Pedro Ferreira", 
        "jp@gmail.com", 
        "1999892321", 
        "jpferreira_li");

        service.salvar(c1);

        List<ContatoVO> contatos = service.buscarTodos();

        System.out.println(contatos);
    
    }
}
