package org.example.Design_patterns.observer;

public class StockManager implements Observer {
    @Override
    public void update(Product prod){
        System.out.printf("Le StockManager observe %d de [%s]%n", prod.getStockLevel(), prod.getProductName());
    }
}