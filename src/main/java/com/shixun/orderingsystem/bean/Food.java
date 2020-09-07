package com.shixun.orderingsystem.bean;

public class Food {
    private String foodName;
    private Double foodPrice;
    private int foodNumber;
    private String foodType;
    private String imgUrl;
    private String foodIngredients;

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public void setFoodIngredients(String foodIngredients) {
        this.foodIngredients = foodIngredients;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodNumber() {
        return foodNumber;
    }

    public void setFoodNumber(int foodNumber) {
        this.foodNumber = foodNumber;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodNumber=" + foodNumber +
                ", foodType='" + foodType + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", foodIngredients='" + foodIngredients + '\'' +
                '}';
    }
}
