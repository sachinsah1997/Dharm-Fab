package com.example.sachin.dharm_fab;

/**
 * Created by NgocTri on 3/4/2017.
 */

public class ImageUpload {

    public String name;
    public String url;

    public String address;
    public String phone;


    public String category;


    public String width;
    public String minorder;
    public String rate;
    public String length;


    public String quality;



    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWidth() {
        return width;
    }

    public String getMinorder() {
        return minorder;
    }


    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }


    public String getRate() {
        return rate;
    }

    public String getLength() {
        return length;
    }

    public String getQuality() {
        return quality;
    }


    public String getCategory() {
        return category;
    }

    public ImageUpload(String name, String url) {
        this.name = name;
        this.url = url;
    }


    public ImageUpload(String url,String address ,String name,String phone ) {

        this.url = url;
        this.address = address;
        this.name=name;
        this.phone=phone;

    }





    public ImageUpload(String url,String quality,String rate,String length,String category,String width,String minorder) {

        this.url = url;
        this.quality=quality;
        this.rate=rate;
        this.length=length;
        this.category=category;
        this.width=width;
        this.minorder=minorder;
    }

    public ImageUpload(){}




}
