package ca.ciccc.wmad.assignment7.question1;

public class Building {

    private String buildingOwner;
    private Integer buildingPrice;
    private Integer howManyRooms;

    public Building(String buildingOwner, Integer buildingPrice, Integer howManyRooms) {
        this.buildingOwner = buildingOwner;
        this.buildingPrice = buildingPrice;
        this.howManyRooms = howManyRooms;
    }

    public String getBuildingOwner() {
        return buildingOwner;
    }

    public Integer getBuildingPrice() {
        return buildingPrice;
    }

    public Integer getHowManyRooms() {
        return howManyRooms;
    }

    public void setBuildingOwner(String buildingOwner) {
        this.buildingOwner = buildingOwner;
    }

    public void setBuildingPrice(Integer buildingPrice) {
        this.buildingPrice = buildingPrice;
    }

    public void setHowManyRooms(Integer howManyRooms) {
        this.howManyRooms = howManyRooms;
    }
}
