package com.zmarkan.feedzillamodels;

/**
 * Created by zan on 10/01/15.
 */
public class Subcategory {
    
    private int category_id;
    private String display_subcategory_name;
    private String english_subcategory_name;
    private int subcategory_id;
    private String url_subcategory_name;

    public String getUrl_subcategory_name() {
        return url_subcategory_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getDisplay_subcategory_name() {
        return display_subcategory_name;
    }

    public String getEnglish_subcategory_name() {
        return english_subcategory_name;
    }

    public int getSubcategory_id() {
        return subcategory_id;
    }
}
