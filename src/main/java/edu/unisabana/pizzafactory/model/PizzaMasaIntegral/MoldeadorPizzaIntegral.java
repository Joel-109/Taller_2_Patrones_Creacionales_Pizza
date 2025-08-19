package edu.unisabana.pizzafactory.model.PizzaMasaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.interfaces.Moldeador;

public class MoldeadorPizzaIntegral implements Moldeador {
    
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

    public void molderarPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
