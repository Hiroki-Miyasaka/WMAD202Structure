package ca.ciccc.wmad.assignment6.question2;

import ca.ciccc.wmad.assignment6.question0.Product;

public interface IShoppingCart {

    void addItem(Product product);

    Float totalMoney();

    void printAllProduct();
}
