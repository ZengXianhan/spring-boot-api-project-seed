package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "store_item")
public class StoreItem {
    @Id
    @Column(name = "si_id")
    private Integer siId;

    @Column(name = "si_store_id")
    private Integer siStoreId;

    @Column(name = "si_category_sic_id")
    private Integer siCategorySicId;

    @Column(name = "si_master_id")
    private Integer siMasterId;

    @Column(name = "si_color_id")
    private Integer siColorId;

    @Column(name = "si_name")
    private String siName;

    @Column(name = "si_description")
    private String siDescription;

    @Column(name = "si_picture_url")
    private String siPictureUrl;

    @Column(name = "si_multi_size")
    private Byte siMultiSize;

    @Column(name = "si_class")
    private String siClass;

    @Column(name = "si_priority")
    private Byte siPriority;

    @Column(name = "si_sales_volume")
    private Integer siSalesVolume;

    @Column(name = "si_available")
    private Byte siAvailable;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return si_id
     */
    public Integer getSiId() {
        return siId;
    }

    /**
     * @param siId
     */
    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    /**
     * @return si_store_id
     */
    public Integer getSiStoreId() {
        return siStoreId;
    }

    /**
     * @param siStoreId
     */
    public void setSiStoreId(Integer siStoreId) {
        this.siStoreId = siStoreId;
    }

    /**
     * @return si_category_sic_id
     */
    public Integer getSiCategorySicId() {
        return siCategorySicId;
    }

    /**
     * @param siCategorySicId
     */
    public void setSiCategorySicId(Integer siCategorySicId) {
        this.siCategorySicId = siCategorySicId;
    }

    /**
     * @return si_master_id
     */
    public Integer getSiMasterId() {
        return siMasterId;
    }

    /**
     * @param siMasterId
     */
    public void setSiMasterId(Integer siMasterId) {
        this.siMasterId = siMasterId;
    }

    /**
     * @return si_color_id
     */
    public Integer getSiColorId() {
        return siColorId;
    }

    /**
     * @param siColorId
     */
    public void setSiColorId(Integer siColorId) {
        this.siColorId = siColorId;
    }

    /**
     * @return si_name
     */
    public String getSiName() {
        return siName;
    }

    /**
     * @param siName
     */
    public void setSiName(String siName) {
        this.siName = siName;
    }

    /**
     * @return si_description
     */
    public String getSiDescription() {
        return siDescription;
    }

    /**
     * @param siDescription
     */
    public void setSiDescription(String siDescription) {
        this.siDescription = siDescription;
    }

    /**
     * @return si_picture_url
     */
    public String getSiPictureUrl() {
        return siPictureUrl;
    }

    /**
     * @param siPictureUrl
     */
    public void setSiPictureUrl(String siPictureUrl) {
        this.siPictureUrl = siPictureUrl;
    }

    /**
     * @return si_multi_size
     */
    public Byte getSiMultiSize() {
        return siMultiSize;
    }

    /**
     * @param siMultiSize
     */
    public void setSiMultiSize(Byte siMultiSize) {
        this.siMultiSize = siMultiSize;
    }

    /**
     * @return si_class
     */
    public String getSiClass() {
        return siClass;
    }

    /**
     * @param siClass
     */
    public void setSiClass(String siClass) {
        this.siClass = siClass;
    }

    /**
     * @return si_priority
     */
    public Byte getSiPriority() {
        return siPriority;
    }

    /**
     * @param siPriority
     */
    public void setSiPriority(Byte siPriority) {
        this.siPriority = siPriority;
    }

    /**
     * @return si_sales_volume
     */
    public Integer getSiSalesVolume() {
        return siSalesVolume;
    }

    /**
     * @param siSalesVolume
     */
    public void setSiSalesVolume(Integer siSalesVolume) {
        this.siSalesVolume = siSalesVolume;
    }

    /**
     * @return si_available
     */
    public Byte getSiAvailable() {
        return siAvailable;
    }

    /**
     * @param siAvailable
     */
    public void setSiAvailable(Byte siAvailable) {
        this.siAvailable = siAvailable;
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