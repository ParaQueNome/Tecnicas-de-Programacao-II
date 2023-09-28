package dao.factories;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import domain.Contato;

public class ContatoMySqliDAO implements IContatoDAO {
    // Inversao de dependencia
    private Connection connection;
    public ContatoMySqliDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void salvar(Contato contato) {
        StringBuilder builder = new StringBuilder();
        builder.append("INSERT INTO contatos(").append("nome, email, telefone,linkedin)").append("VALUES('");
        
        Statement stm = null;
        try {
            stm = connection.createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(!Objects.isNull(stm)){
                stm.close();
            }
            
        }
        }
         
    
    @Override
    public void atualizar(Contato contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void excluir(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public List<Contato> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Contato buscarPorEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorEmail'");
    }
    
}
