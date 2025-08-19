package edu.unisabana.pizzafactory.model.Factories;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.PizzaDelgada.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;



public class PizzaDelgadaFactory extends PizzaMachineFactory {


    @Override
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador am = new AmasadorPizzaDelgada();
        Horneador hpd = new HorneadorPizzaDelgada();
        Moldeador mp = new MoldeadorPizzaDelgada();

        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PizzaDelgadaFactory.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR   
    }

    @Override
    public Amasador getAmasador(){
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador getMoldeador(){
        return new MoldeadorPizzaDelgada();
    }

    @Override 
    public Horneador getHorneador(){
        return new HorneadorPizzaDelgada();
    }
}
