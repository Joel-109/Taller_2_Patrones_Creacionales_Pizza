package edu.unisabana.pizzafactory.model.Factories;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.PizzaGruesa.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.PizzaGruesa.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.PizzaGruesa.MoldeadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;

public class PizzaGruesaFactory extends PizzaMachineFactory{

    @Override
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador am = new AmasadorPizzaGruesa();
        Horneador hpd = new HorneadorPizzaGruesa();
        Moldeador mp = new MoldeadorPizzaGruesa();
        
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
        Logger.getLogger(PizzaGruesaFactory.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR   
    }

    @Override
    public Amasador getAmasador(){
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Horneador getHorneador(){
        return new HorneadorPizzaGruesa();
    }

    @Override
    public Moldeador getMoldeador(){
        return new MoldeadorPizzaGruesa();
    }
    
}
