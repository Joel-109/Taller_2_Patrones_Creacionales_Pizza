
package edu.unisabana.pizzafactory.consoleview;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Factories.PizzaDelgadaFactory;
import edu.unisabana.pizzafactory.model.Factories.PizzaGruesaFactory;
import edu.unisabana.pizzafactory.model.Factories.PizzaIntegralFactory;
import edu.unisabana.pizzafactory.model.Factories.PizzaMachineFactory;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            
            PizzaMachineFactory pdf = new PizzaDelgadaFactory();
            PizzaMachineFactory pgf = new PizzaGruesaFactory();
            PizzaMachineFactory pif = new PizzaIntegralFactory();

            System.out.println("Aca Paso");

            pdf.prepararPizza(ingredientes, Tamano.MEDIANO);
            pgf.prepararPizza(ingredientes,Tamano.PEQUENO);
            pif.prepararPizza(ingredientes, Tamano.MEDIANO);
            

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    

}
