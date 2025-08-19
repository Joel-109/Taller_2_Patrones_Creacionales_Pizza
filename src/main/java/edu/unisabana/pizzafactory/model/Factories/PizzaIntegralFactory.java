package edu.unisabana.pizzafactory.model.Factories;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.PizzaMasaIntegral.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.PizzaMasaIntegral.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.PizzaMasaIntegral.MoldeadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;

public class PizzaIntegralFactory extends PizzaMachineFactory {

    @Override
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador am = new AmasadorPizzaIntegral();
        Horneador hpd = new HorneadorPizzaIntegral();
        Moldeador mp = new MoldeadorPizzaIntegral();
        
        am.amasar();
        if (null == tam) {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        } else switch (tam) {
             case PEQUENO:
                 mp.moldearPizzaPequena();
                 break;
             case MEDIANO:
                 mp.molderarPizzaMediana();
                 break;
             default:
                 throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
         }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PizzaIntegralFactory.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR   
    }
    
    @Override
    public Amasador getAmasador(){
        return new AmasadorPizzaIntegral();
    }

    @Override 
    public Horneador getHorneador(){
        return new HorneadorPizzaIntegral();
    }

    @Override
    public Moldeador getMoldeador(){
        return new MoldeadorPizzaIntegral();
    }
}
