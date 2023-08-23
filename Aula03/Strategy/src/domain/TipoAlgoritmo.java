package domain;
public enum TipoAlgoritmo {
    PAPEL(1),
    TESOURA(2), 
    PEDRA(3), 
    LAGARTO(4), 
    SPOCK(5);

    private Integer id;
    TipoAlgoritmo(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }
    public static TipoAlgoritmo getTipoAlgoritmo(Integer id){
        for(TipoAlgoritmo tipoAlgoritmo : TipoAlgoritmo.values()){
            if(tipoAlgoritmo.getId().equals(id)){
                return tipoAlgoritmo;
            }
        }
        throw new RuntimeException("Tipo algoritmo inválido.");
    
        
    }
}
