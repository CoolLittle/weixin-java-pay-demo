package com.jgkj.payment.bean;

public class PaymentProduct {
    private Integer id;

    private String bid;

    private String productName;

    private Integer originProductPrice;

    private Integer productPrice;

    private String productDescript;

    private Integer isRecommend;

    private Integer createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getOriginProductPrice() {
        return originProductPrice;
    }

    public void setOriginProductPrice(Integer originProductPrice) {
        this.originProductPrice = originProductPrice;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescript() {
        return productDescript;
    }

    public void setProductDescript(String productDescript) {
        this.productDescript = productDescript == null ? null : productDescript.trim();
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}