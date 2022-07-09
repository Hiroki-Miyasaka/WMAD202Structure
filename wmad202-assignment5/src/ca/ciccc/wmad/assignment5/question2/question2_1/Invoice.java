package ca.ciccc.wmad.assignment5.question2.question2_1;

import java.util.ArrayList;

public class Invoice {

    private double totalPrice;
    private ArrayList<Product> productsList;

    public Invoice(){
        this.totalPrice = 0;
        this.productsList = new ArrayList<Product>();
    }

    public void addProduct(Product item){
        this.productsList.add(item);
    }

    public double getTotalPrice(){
        for(Product item : productsList){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void printInvoice(){
        for(Product item : productsList){
            item.printProductInfo();
        }

        double totalPrice = getTotalPrice();
        System.out.println("Total Price:" + totalPrice);
    }
}
