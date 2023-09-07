package domain;

public class Pedra implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        switch(tipo){
            case PAPEL:
                System.out.println("Perdeu! Pedra é embrulhada pelo Papel");
                break;
            case TESOURA:
                System.out.println("Ganhou! Pedra quebra Tesoura");
                break;
            case SPOCK:
                System.out.println("Perdeu! Spock pulveriza Pedra");
                break;
            case LAGARTO:
                System.out.println("Ganhou! Pedra esmaga Lagarto");
            default:
                System.out.println("Empatou!");
        }
    
    }
    
}
