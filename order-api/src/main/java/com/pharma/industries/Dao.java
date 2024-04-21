package com.pharma.industries;

import java.util.List;

public class Dao {

    public static List<Drug> getDrugList(){
        Drug drug = new Drug();
        drug.setDrugId(1);
        drug.setDrugName("ACE");
        drug.setPrice(23.00);
        drug.setStock(drug.getStock());
        drug.setCategoryList(drug.getCategoryList());
        return List.of(drug);
    }
}
