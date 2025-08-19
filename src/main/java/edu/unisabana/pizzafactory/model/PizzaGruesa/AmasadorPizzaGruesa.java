package edu.unisabana.pizzafactory.model.PizzaGruesa;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Amasador;

public class AmasadorPizzaGruesa implements Amasador{
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
