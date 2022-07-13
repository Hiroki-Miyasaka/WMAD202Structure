package ca.ciccc.wmad.assignment6.question0;

public class Product extends Object{

    private Integer productId;
    private String productName;
    private Float productPrice;
    private String productMadeInCountry;

    public Product(Integer productId, String productName, Float productPrice, String productMadeInCountry){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }

    public Integer getProductId(){return this.productId;};

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public String getProductName(){return this.productName;};

    public void setProductName(String productName){
        this.productName = productName;
    }

    public Float getProductPrice(){return this.productPrice;}

    public void setProductPrice(Float productPrice){
        this.productPrice = productPrice;
    }

    public String getProductMadeInCountry(){return this.productMadeInCountry;}

    public void setProductMadeInCountry(String productMadeInCountry){
        this.productMadeInCountry = productMadeInCountry;
    }

}
