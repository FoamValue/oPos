package cn.live.opos.center.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "psc_sku", uniqueConstraints = { @UniqueConstraint(columnNames = "sku") })
public class PscSkuEntity implements Serializable {

  private static final long serialVersionUID = 8904367725209990433L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id", length = 32)
  private String id;

  @Column(name = "sku", length = 50, nullable = false)
  private String sku;

  @Column(name = "product_no", length = 40, nullable = false)
  private String productNo;

  @Column(name = "product_name", length = 100, nullable = false)
  private String productName;

  @Column(name = "color_no", precision = 4, scale = 0, nullable = false)
  private int colorNo;

  @Column(name = "color_name", nullable = false)
  private int colorName;

  @Column(name = "size_no", precision = 4, scale = 0, nullable = false)
  private int sizeNo;

  @Column(name = "size_name", nullable = false)
  private int sizeName;

  @Column(name = "tag_price", precision = 10, scale = 0, nullable = false)
  private int tagPrice;

  @Column(name = "retail_price", precision = 10, scale = 0, nullable = false)
  private int retailPrice;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ts", columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP()", nullable = false)
  private Date ts;

  public final String getId() {
    return id;
  }

  public final void setId(String id) {
    this.id = id;
  }

  public final String getSku() {
    return sku;
  }

  public final void setSku(String sku) {
    this.sku = sku;
  }

  public final String getProductNo() {
    return productNo;
  }

  public final void setProductNo(String productNo) {
    this.productNo = productNo;
  }

  public final String getProductName() {
    return productName;
  }

  public final void setProductName(String productName) {
    this.productName = productName;
  }

  public final int getColorNo() {
    return colorNo;
  }

  public final void setColorNo(int colorNo) {
    this.colorNo = colorNo;
  }

  public final int getColorName() {
    return colorName;
  }

  public final void setColorName(int colorName) {
    this.colorName = colorName;
  }

  public final int getSizeNo() {
    return sizeNo;
  }

  public final void setSizeNo(int sizeNo) {
    this.sizeNo = sizeNo;
  }

  public final int getSizeName() {
    return sizeName;
  }

  public final void setSizeName(int sizeName) {
    this.sizeName = sizeName;
  }

  public final int getTagPrice() {
    return tagPrice;
  }

  public final void setTagPrice(int tagPrice) {
    this.tagPrice = tagPrice;
  }

  public final int getRetailPrice() {
    return retailPrice;
  }

  public final void setRetailPrice(int retailPrice) {
    this.retailPrice = retailPrice;
  }

  public final Date getTs() {
    return ts;
  }

  public final void setTs(Date ts) {
    this.ts = ts;
  }

  public static final long getSerialversionuid() {
    return serialVersionUID;
  }

}
