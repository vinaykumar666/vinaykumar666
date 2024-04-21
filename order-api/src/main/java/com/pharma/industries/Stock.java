package com.pharma.industries;

import javax.persistence.criteria.CriteriaBuilder;

public class Stock {
    private Integer skuId;
    private Integer unit;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }
}
