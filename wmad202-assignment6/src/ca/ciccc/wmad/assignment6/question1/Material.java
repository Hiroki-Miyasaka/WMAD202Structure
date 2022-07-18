package ca.ciccc.wmad.assignment6.question1;

public class Material {

    private Integer materialCode;
    private String materialName;

    public Material(Integer materialCode, String materialName){
        this.materialCode = materialCode;
        this.materialName = materialName;
    }

    public Integer getMaterialCode(){return this.materialCode;}

    public void setMaterialCode(Integer materialCode){
        this.materialCode = materialCode;
    }

    public String getMaterialName(){return materialName;}

    public void setMaterialName(String materialName){
        this.materialName = materialName;
    }
}
