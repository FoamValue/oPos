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
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "jpa-uuid")
  @GenericGenerator(name = "jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "id", length = 36)
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
  private String colorName;

  @Column(name = "size_no", precision = 4, scale = 0, nullable = false)
  private int sizeNo;

  @Column(name = "size_name", nullable = false)
  private String sizeName;

  @Column(name = "tag_price", precision = 10, scale = 0, nullable = false)
  private int tagPrice;

  @Column(name = "retail_price", precision = 10, scale = 0, nullable = false)
  private int retailPrice;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ts", columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP()", nullable = false)
  private Date ts;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public String getProductNo() {
    return productNo;
  }

  public void setProductNo(String productNo) {
    this.productNo = productNo;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getColorNo() {
    return colorNo;
  }

  public void setColorNo(int colorNo) {
    this.colorNo = colorNo;
  }

  public String getColorName() {
    return colorName;
  }

  public void setColorName(String colorName) {
    this.colorName = colorName;
  }

  public int getSizeNo() {
    return sizeNo;
  }

  public void setSizeNo(int sizeNo) {
    this.sizeNo = sizeNo;
  }

  public String getSizeName() {
    return sizeName;
  }

  public void setSizeName(String sizeName) {
    this.sizeName = sizeName;
  }

  public int getTagPrice() {
    return tagPrice;
  }

  public void setTagPrice(int tagPrice) {
    this.tagPrice = tagPrice;
  }

  public int getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(int retailPrice) {
    this.retailPrice = retailPrice;
  }

  public Date getTs() {
    return ts;
  }

  public void setTs(Date ts) {
    this.ts = ts;
  }

  public final static long getSerialversionuid() {
    return serialVersionUID;
  }

}
