package com.zmarkan.feedzillamodels;

/**
 * Created by zan on 10/01/15.
 */
public class Category {

    private int category_id;
    private String country_code;
    private String display_category_name;
    private String english_category_name;
    private String url_category_name;
    
    public int getCategory_id() {
        return category_id;
    }
    
    public String getCountry_code() {
        return country_code;
    }
    
    public String getDisplay_category_name() {
        return display_category_name;
    }
    
    public String getEnglish_category_name() {
        return english_category_name;
    }

    public String getUrl_category_name() {
        return url_category_name;
    }

}

