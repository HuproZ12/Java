package org.example.Design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    public int stockLevel;
    public String productName;
    public List<Observer> observers;

    public Product(int stockLevel, String productName) {
        this.stockLevel = stockLevel;
        this.productName = productName;
        this.observers = new ArrayList<>();
    }

    public int getStockLevel(){
        return stockLevel;
    }

    public void setStockLevel(int stockLevel){
        this.stockLevel = stockLevel;
        System.out.printf("Maj stock à %d%n", stockLevel);
        notifyObservers();
    }

    public String getProductName(){
        return productName;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}