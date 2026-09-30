package com.example.videoprojekt.Model;

public class Car {
    int id;
    String brand;
    int modelYear;
    String type;
    String color;
    String licenseplate;
    String image;

    public Car(int id, String brand, int modelYear, String type, String color, String licenseplate, String image) {
        this.id = id;
        this.brand = brand;
        this.modelYear = modelYear;
        this.type = type;
        this.color = color;
        this.licenseplate = licenseplate;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
