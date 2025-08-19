
package edu.unisabana.pizzafactory.model.PizzaDelgada;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.interfaces.Moldeador;

/**
 *
 * @author cesarvefe
 */
public class MoldeadorPizzaDelgada implements Moldeador {

    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

    public void molderarPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
