package edu.unisabana.pizzafactory.model.PizzaMasaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Amasador;

public class AmasadorPizzaIntegral implements Amasador{
    
     public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
