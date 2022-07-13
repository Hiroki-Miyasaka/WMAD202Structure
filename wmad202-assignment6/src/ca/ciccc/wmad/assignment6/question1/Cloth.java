package ca.ciccc.wmad.assignment6.question1;

import ca.ciccc.wmad.assignment6.question0.Product;

import java.util.ArrayList;

public class Cloth extends Product{

    private ArrayList<Material> clothMaterials;

    public Cloth(Integer clothId, String clothName, Float clothPrice, String clothMadeInCountry, ArrayList<Material> clothMaterials){
        super(clothId, clothName, clothPrice, clothMadeInCountry);
        this.clothMaterials = clothMaterials;
    }

    public ArrayList<Material> getClothMaterials(){return clothMaterials;}

    public void setClothMaterials(ArrayList<Material> clothMaterials){
        this.clothMaterials = clothMaterials;
    }
}
