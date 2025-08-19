package edu.unisabana.pizzafactory.model.PizzaMasaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.interfaces.Horneador;

public class HorneadorPizzaIntegral implements Horneador{
    
    public void hornear() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza Integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
