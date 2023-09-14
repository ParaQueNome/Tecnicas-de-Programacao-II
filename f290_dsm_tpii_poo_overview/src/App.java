import domain.Usuario;
import domain.Professor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import domain.Curso;

public class App {
    public static void main(String[] args) throws Exception {
            //criação de um objseto
           
           
          
            /* Usuario contato2 =  new Usuario();
            contato2.nome = "João Bravo";
            contato2.telefone = "19 88888 - 8888";
            contato2.configurarEmail("joao@gmail.com");
            contato2.github = "joaof290";

            contato1.exibirDados();
            contato2.exibirDados();
            contato1.configurarEmail("pedrogmail.com");
            contato1.exibirDados();

          */
          Professor prof = new Professor("guilherme","gg@gmail.com","1242243","@githu.com",12143);
          prof.autenticar("user", "password");
          String nomeCurso = "Desenvolvimento de Software Multiplataforma";
          List<String> conhecimentos = Arrays.asList("Programação Web","Programação Mobile","Gestao de Projetos");
          // TODO: Criar toString() da Classe Curso.
          Curso curso = new Curso(nomeCurso, conhecimentos);
          prof.ensina(curso);
          System.out.println(curso);


           }

           
    }

