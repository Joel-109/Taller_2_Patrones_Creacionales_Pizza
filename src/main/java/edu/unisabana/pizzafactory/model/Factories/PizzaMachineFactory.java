package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;

public abstract class PizzaMachineFactory {
    
    public abstract Amasador getAmasador();
    public abstract Horneador getHorneador();
    public abstract Moldeador getMoldeador();
    public abstract void prepararPizza(Ingrediente[] ingredientes, Tamano tam)  throws ExcepcionParametrosInvalidos;
}
