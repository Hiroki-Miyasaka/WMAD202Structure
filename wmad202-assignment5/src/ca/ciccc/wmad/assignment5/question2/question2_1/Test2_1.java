package ca.ciccc.wmad.assignment5.question2.question2_1;

public class Test2_1 {

    public void testrun() {
        Product product1 = new Product("banana", 100);
        Product product2 = new Product("apple", 200);
        Product product3 = new Product("rice", 500);

        Invoice invoice = new Invoice();
        product1.printProductInfo();
        invoice.addProduct(product1);
        invoice.addProduct(product2);
        invoice.addProduct(product3);
        invoice.printInvoice();

    }
}
