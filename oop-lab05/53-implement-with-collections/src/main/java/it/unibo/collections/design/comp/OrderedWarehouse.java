package it.unibo.collections.design.comp;

import it.unibo.collections.design.impl.WarehouseImpl;
import it.unibo.collections.design.api.Product;
import java.util.Set;
import java.util.TreeSet;

public class OrderedWarehouse extends WarehouseImpl{

   public OrderedWarehouse(){
    super();
   }

   public Set<Product> allProducts(){
    final Set<Product> setCopy = new TreeSet<>(this.set);
    return setCopy;
    }
}