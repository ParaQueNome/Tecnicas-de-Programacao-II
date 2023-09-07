package domain;

public class Lagarto implements Algoritmo {
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        switch(tipo){
            case PEDRA:
                System.out.println("Perdeu! Pedra esmaga Lagarto");
                break;
            case SPOCK:
                System.out.println("Ganhou! Lagarto envenena Spock");
                break;
            case TESOURA:
                System.out.println("Perdeu! Tesoura decapita o Lagarto");
                break;
            case PAPEL:
                System.out.println("Ganhou! Lagarto come o papel");
                break;
            
            default:
                System.out.println("Empatou! Papel empata com Papel.");
        }
    }
}
