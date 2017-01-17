package com.allstate.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {
    private int id;
    private int version;
    private String name;
    private String stocknumber;
    private String description;
    private int rating;
    private int noofreviews;
    private double listprice;
    private float percentoff;
    private double actualprice;
    private int quantity;
    private boolean isrestricted;

    @GeneratedValue
    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Version
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public String getStocknumber() {
        return stocknumber;
    }
    public void setStocknumber(String stocknumber) {
        this.stocknumber = stocknumber;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Column(nullable = false)
    public double getActualprice() {
        return actualprice;
    }
    public void setActualprice(double actualprice) {
        this.actualprice = actualprice;
    }


    public int getNoofreviews() {
        return noofreviews;
    }
    public void setNoofreviews(int noofreviews) {
        this.noofreviews = noofreviews;
    }

    @Column(nullable = false)
    public double getListprice() {
        return listprice;
    }
    public void setListprice(double listprice) {
        this.listprice = listprice;
    }

    public float getPercentoff() {
        return percentoff;
    }
    public void setPercentoff(float percentoff) {
        this.percentoff = percentoff;
    }



    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isIsrestricted() {
        return isrestricted;
    }
    public void setIsrestricted(boolean isrestricted) {
        this.isrestricted = isrestricted;
    }
}
