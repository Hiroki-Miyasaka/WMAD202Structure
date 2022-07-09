package ca.ciccc.wmad.assignment5.question2.question2_1;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void printProductInfo(){
        System.out.println("Name: " + this.name + " " + "Price: " + this.price);
    }

    public double getPrice(){
        return this.price;
    }
}
