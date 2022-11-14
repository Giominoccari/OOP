package it.unibo.collections.design.comp;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.impl.ProductImpl;
import java.lang.Comparable;

public class ComparableProduct extends ProductImpl implements Comparable<Product>  {
    public ComparableProduct(String name, double quantity){
        super(name, quantity);
    }

    public int compareTo(Product p){
        return this.getName().compareTo(p.getName());

    }
}