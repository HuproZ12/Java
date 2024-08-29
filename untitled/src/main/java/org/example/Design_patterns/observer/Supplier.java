package org.example.Design_patterns.observer;

public class Supplier implements Observer {
    @Override
    public void update(Product prod){
        System.out.printf("Le supplier observe %d de [%s]%n", prod.getStockLevel(), prod.getProductName());
    }
}