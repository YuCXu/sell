package com.xyc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 商品（包含类目）
 */
public class ProductVO implements Serializable{

    private static final long serialVersionUID = -7743375710479924513L;
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public void setProductInfoVOList(List<ProductInfoVO> productInfoVOList) {
        this.productInfoVOList = productInfoVOList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public List<ProductInfoVO> getProductInfoVOList() {
        return productInfoVOList;
    }
}
