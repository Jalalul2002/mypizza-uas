package lat.pam.mypizza.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("price")
    @Expose
    private Object price;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("details")
    @Expose
    private Object details;
    @SerializedName("foodName")
    @Expose
    private Object foodName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    public Object getFoodName() {
        return foodName;
    }

    public void setFoodName(Object foodName) {
        this.foodName = foodName;
    }
}