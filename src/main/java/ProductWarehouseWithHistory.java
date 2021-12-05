/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return received;
    }

    public String history() {
        return this.history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());           
    }
}
