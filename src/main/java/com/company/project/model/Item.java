package com.company.project.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Item implements Serializable {
    @Id
    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "item_category_ic_id")
    private Integer itemCategoryIcId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_master_id")
    private Integer itemMasterId;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "item_picture_url")
    private String itemPictureUrl;

    @Column(name = "item_color_id")
    private Integer itemColorId;

    @Column(name = "item_avg_price")
    private Double itemAvgPrice;

    @Column(name = "item_class")
    private String itemClass;

    @Column(name = "item_priority")
    private Byte itemPriority;

    @Column(name = "item_sales_volume")
    private Integer itemSalesVolume;

    @Column(name = "item_available")
    private Byte itemAvailable;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return item_id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * @return item_category_ic_id
     */
    public Integer getItemCategoryIcId() {
        return itemCategoryIcId;
    }

    /**
     * @param itemCategoryIcId
     */
    public void setItemCategoryIcId(Integer itemCategoryIcId) {
        this.itemCategoryIcId = itemCategoryIcId;
    }

    /**
     * @return item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return item_master_id
     */
    public Integer getItemMasterId() {
        return itemMasterId;
    }

    /**
     * @param itemMasterId
     */
    public void setItemMasterId(Integer itemMasterId) {
        this.itemMasterId = itemMasterId;
    }

    /**
     * @return item_description
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return item_picture_url
     */
    public String getItemPictureUrl() {
        return itemPictureUrl;
    }

    /**
     * @param itemPictureUrl
     */
    public void setItemPictureUrl(String itemPictureUrl) {
        this.itemPictureUrl = itemPictureUrl;
    }

    /**
     * @return item_color_id
     */
    public Integer getItemColorId() {
        return itemColorId;
    }

    /**
     * @param itemColorId
     */
    public void setItemColorId(Integer itemColorId) {
        this.itemColorId = itemColorId;
    }

    /**
     * @return item_avg_price
     */
    public Double getItemAvgPrice() {
        return itemAvgPrice;
    }

    /**
     * @param itemAvgPrice
     */
    public void setItemAvgPrice(Double itemAvgPrice) {
        this.itemAvgPrice = itemAvgPrice;
    }

    /**
     * @return item_class
     */
    public String getItemClass() {
        return itemClass;
    }

    /**
     * @param itemClass
     */
    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    /**
     * @return item_priority
     */
    public Byte getItemPriority() {
        return itemPriority;
    }

    /**
     * @param itemPriority
     */
    public void setItemPriority(Byte itemPriority) {
        this.itemPriority = itemPriority;
    }

    /**
     * @return item_sales_volume
     */
    public Integer getItemSalesVolume() {
        return itemSalesVolume;
    }

    /**
     * @param itemSalesVolume
     */
    public void setItemSalesVolume(Integer itemSalesVolume) {
        this.itemSalesVolume = itemSalesVolume;
    }

    /**
     * @return item_available
     */
    public Byte getItemAvailable() {
        return itemAvailable;
    }

    /**
     * @param itemAvailable
     */
    public void setItemAvailable(Byte itemAvailable) {
        this.itemAvailable = itemAvailable;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}