package domain;

public class Tesoura implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        
        switch(tipo){
            case PAPEL:
                System.out.println("Ganhou! Tesoura corta Papel");
                break;
            case PEDRA:
                System.out.println("Perdeu! Pedra quebra Tesoura");
                break;
            case SPOCK:
                System.out.println("Perdeu! Spock vaporiza tesoura");
                break;
            case LAGARTO:
                System.out.println("Ganhou! Tesoura decapita Lagarto");
            default:
                System.out.println("Empatou!");
        }
    }
    
}
