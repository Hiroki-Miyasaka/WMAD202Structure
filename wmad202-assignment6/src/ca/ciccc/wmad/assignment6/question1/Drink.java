package ca.ciccc.wmad.assignment6.question1;

import ca.ciccc.wmad.assignment6.question0.Product;
import com.sun.jdi.IntegerType;

public class Drink extends Product{

    private Boolean isDrinkDiet;
    private Integer drinkSize;

    public Drink(Integer drinkId, String drinkName, Float drinkPrice, String drinkMadeInCountry, Boolean isDrinkDiet, Integer drinkSize){
        super(drinkId, drinkName, drinkPrice, drinkMadeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }

    public Boolean getIsDrinkDiet(){return this.isDrinkDiet;}

    public void setIsDrinkDiet(Boolean isDrinkDiet){
        this.isDrinkDiet = isDrinkDiet;
    }

    public Integer getDrinkSize(){return this.drinkSize;}

    public void setIsDrinkDiet(){
        this.drinkSize = drinkSize;
    }
}
