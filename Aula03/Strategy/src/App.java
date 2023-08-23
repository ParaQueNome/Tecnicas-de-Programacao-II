import java.util.Scanner;

import domain.TipoAlgoritmo;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Selecione o tipo");
       Scanner s = new Scanner(System.in);
       int tipoa = s.nextInt();
       TipoAlgoritmo tipo = TipoAlgoritmo.getTipoAlgoritmo(tipoa);
        

    }
}
