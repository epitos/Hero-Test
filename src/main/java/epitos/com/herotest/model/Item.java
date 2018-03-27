package epitos.com.herotest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by epitos on 27/03/2018.
 */

public class Item {

    @SerializedName("brand_name")
    private String brandName;
    @SerializedName("name")
    private String name;
    @SerializedName("size")
    private String size;
    @SerializedName("ingredients")
    private String ingredients;
    @SerializedName("serving_size")
    private String servingSize;
    @SerializedName("servings_per_container")
    private String servingsPerContainer;
    @SerializedName("calories")
    private Integer calories;
    @SerializedName("fat_calories")
    private Integer fatCalories;
    @SerializedName("fat")
    private String fat;
    @SerializedName("saturated_fat")
    private String saturatedFat;
    @SerializedName("trans_fat")
    private String transFat;
    @SerializedName("polyunsaturated_fat")
    private String polyunsaturatedFat;
    @SerializedName("monounsaturated_fat")
    private String monounsaturatedFat;
    @SerializedName("cholesterol")
    private Integer cholesterol;
    @SerializedName("sodium")
    private Integer sodium;
    @SerializedName("potassium")
    private Integer potassium;
    @SerializedName("carbohydrate")
    private Integer carbohydrate;
    @SerializedName("fiber")
    private Integer fiber;
    @SerializedName("sugars")
    private Integer sugars;
    @SerializedName("protein")
    private Integer protein;
    @SerializedName("author")
    private String author;
    @SerializedName("format")
    private String format;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("pages")
    private Integer pages;


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public String getServingsPerContainer() {
        return servingsPerContainer;
    }

    public void setServingsPerContainer(String servingsPerContainer) {
        this.servingsPerContainer = servingsPerContainer;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getFatCalories() {
        return fatCalories;
    }

    public void setFatCalories(Integer fatCalories) {
        this.fatCalories = fatCalories;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(String saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public String getTransFat() {
        return transFat;
    }

    public void setTransFat(String transFat) {
        this.transFat = transFat;
    }

    public String getPolyunsaturatedFat() {
        return polyunsaturatedFat;
    }

    public void setPolyunsaturatedFat(String polyunsaturatedFat) {
        this.polyunsaturatedFat = polyunsaturatedFat;
    }

    public String getMonounsaturatedFat() {
        return monounsaturatedFat;
    }

    public void setMonounsaturatedFat(String monounsaturatedFat) {
        this.monounsaturatedFat = monounsaturatedFat;
    }

    public Integer getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Integer cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Integer getSodium() {
        return sodium;
    }

    public void setSodium(Integer sodium) {
        this.sodium = sodium;
    }

    public Integer getPotassium() {
        return potassium;
    }

    public void setPotassium(Integer potassium) {
        this.potassium = potassium;
    }

    public Integer getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Integer carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Integer getFiber() {
        return fiber;
    }

    public void setFiber(Integer fiber) {
        this.fiber = fiber;
    }

    public Integer getSugars() {
        return sugars;
    }

    public void setSugars(Integer sugars) {
        this.sugars = sugars;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
