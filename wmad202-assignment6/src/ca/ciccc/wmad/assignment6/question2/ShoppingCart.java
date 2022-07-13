package ca.ciccc.wmad.assignment6.question2;

import ca.ciccc.wmad.assignment6.question0.Product;

import java.util.ArrayList;

public class ShoppingCart implements IShoppingCart{

    private ArrayList<Product> shoppingCart;

    public ShoppingCart(ArrayList<Product> shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addItem(Product product){
        this.shoppingCart.add(product);
    }

    @Override
    public Float totalMoney(){
        float total = 0;
        for(Product product: shoppingCart){
            total += product.getProductPrice();
        }
        return total;
    }

    @Override
    public void printAllProduct(){
        for(Product product: shoppingCart){
            System.out.println(product.getProductName());
        }
    }
}
