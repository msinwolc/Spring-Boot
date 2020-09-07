package com.shixun.orderingsystem.bean;

public class Order {
    private String orderId;
    private String foodName;
    private Double foodPrice;
    private int foodNumber;
    private String foodType;
    private String foodIngredients;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public void setFoodIngredients(String foodIngredients) {
        this.foodIngredients = foodIngredients;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodNumber=" + foodNumber +
                ", foodType='" + foodType + '\'' +
                ", foodIngredients='" + foodIngredients + '\'' +
                '}';
    }
}
