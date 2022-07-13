package ca.ciccc.wmad.assignment6.question1;

import ca.ciccc.wmad.assignment6.question0.Product;

import java.util.ArrayList;

public class Food extends Product{

    private Integer foodCalorie;
    private Integer foodSize;
    private ArrayList<String> foodIngredients;

    public Food(Integer foodId, String foodName, Float foodPrice, String foodMadeInCountry,Integer foodCalorie, Integer foodSize, ArrayList<String> foodIngredients){
        super(foodId, foodName, foodPrice, foodMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }

    public Integer getFoodCalorie(){return foodCalorie;}

    public void setFoodCalorie(Integer foodCalorie){
        this.foodCalorie = foodCalorie;
    }

    public Integer getFoodSize(){return foodSize;}

    public void setFoodSize(Integer foodSize){
        this.foodSize = foodSize;
    }

    public ArrayList<String> getFoodIngredients(){return this.foodIngredients;}

    public void setFoodIngredients(ArrayList<String> foodIngredients){
        this.foodIngredients = foodIngredients;
    }
}
