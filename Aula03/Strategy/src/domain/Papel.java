package domain;

public class Papel implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        switch(tipo){
            case PEDRA:
                System.out.println("Ganhou! Papel embrulha Pedra");
                break;
            case SPOCK:
                System.out.println("Ganhou! Papel corta Spock");
                break;
            case TESOURA:
                System.out.println("Perdeu! Tesouroa corta o Papel");
                break;
            case LAGARTO:
                System.out.println("Perdeu! Lagarto come o papel");
                break;
            
            default:
                System.out.println("Empatou! Papel empata com Papel.");
        }
    }
    
}
