package it.unibo.collections.design.impl;

import java.util.Set;
import java.util.LinkedHashSet;
import it.unibo.collections.design.api.Warehouse;
import it.unibo.collections.design.api.Product;

public class WarehouseImpl implements Warehouse{
    public Set<Product> set = new LinkedHashSet<>();

    public WarehouseImpl(){
    }

    public void addProduct(Product p){
        set.add(p);
    }

    public Set<String> allNames(){
        final Set<Product> setCopy = new LinkedHashSet<>(this.set);
        Set<String> names = new LinkedHashSet<>();
        for(final var element: setCopy){
            names.add(element.getName());
        }
        return names;
    }

    public Set<Product> allProducts(){
        final Set<Product> setCopy = new LinkedHashSet<>(this.set);
        return setCopy;
    }

    public boolean containsProduct(Product p){
        final Set<Product> setCopy = new LinkedHashSet<>(this.set);
        for(final var element: setCopy){
            if(element.getName() == p.getName()){
                return true;
            }
        }
        return false;
    }

    public double getQuantity(String name){
        final Set<Product> setCopy = new LinkedHashSet<>(this.set);
        for(final var element: setCopy){
            if(element.getName() == name){
                return element.getQuantity();
            }
        }
        return -1;
    }

}