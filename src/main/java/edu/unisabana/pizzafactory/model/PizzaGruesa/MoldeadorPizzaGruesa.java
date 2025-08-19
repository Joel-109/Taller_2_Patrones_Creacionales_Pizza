package edu.unisabana.pizzafactory.model.PizzaGruesa;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.interfaces.Moldeador;

public class MoldeadorPizzaGruesa implements Moldeador{
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa gruesa.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

    public void molderarPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa gruesa.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
