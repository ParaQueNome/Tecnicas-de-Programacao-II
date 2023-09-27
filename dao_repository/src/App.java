import java.sql.ResultSet;

import dao.factories.ConexaoFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        ResultSet rst = ConexaoFactory.getConexao().createStatement().executeQuery("select version() as version;");

        if(rst.next()){
            System.out.println(rst.getString("version"));
        }
    
    }
}
