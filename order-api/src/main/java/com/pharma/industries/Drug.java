package com.pharma.industries;

import java.util.ArrayList;
import java.util.List;

public class Drug {
    private Integer drugId;
    private String drugName;
    private Double price;
    private Stock stock;
    private List<Category> categoryList;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Stock getStock() {
        Stock s = new Stock();
        s.setSkuId(1);
        s.setUnit(3);
        return stock;
    }


    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<Category> getCategoryList() {
        List<Category> categories =new ArrayList<>();
        Category category =new Category();
        category.setCategoryId(1);
        category.setCategory("Sedation");

        Category cat =new Category();
        cat.setCategoryId(2);
        cat.setCategory("Pain");
        categories.add(category);
        categories.add(cat);
        return categories;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }


}
