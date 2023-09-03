package domain;

public class Spock implements Algoritmo {
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        
        switch(tipo){
            case PAPEL:
                System.out.println("Perdeu! Spock é cortado pelo Papel");
                break;
            case PEDRA:
                System.out.println("Ganhou! Spock puylveriza Pedra");
                break;
            case TESOURA:
                System.out.println("Ganhou! Spock vaporiza tesoura");
                break;
            case LAGARTO:
                System.out.println("Perdeu! Lagarto envenena SPOCK");
            default:
                System.out.println("Empatou!");
        }
    }
}
