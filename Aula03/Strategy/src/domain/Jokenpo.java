package domain;

public class Jokenpo {
    private Algoritmo algoritmo;


    public void setAlgoritmo(Algoritmo algoritmo){
        this.algoritmo = algoritmo;

    }

    public void jogar(TipoAlgoritmo tipo){
        algoritmo.executar(tipo);
    }
}
