package cn.live.opos.center.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "osc_order_item", uniqueConstraints = {
    @UniqueConstraint(columnNames = { "order_no", "sku" }) })
public class OscOrderItemEntity implements Serializable {

  private static final long serialVersionUID = -7331381906879927968L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id", length = 32)
  private String id;

  @Column(name = "order_no", length = 40, nullable = false)
  private String orderNo;

  @Column(name = "sku", length = 50, nullable = false)
  private String sku;

  @Column(name = "num", precision = 5, scale = 0, nullable = false)
  private int num;

  @Column(name = "tag_price", precision = 10, scale = 0, nullable = false)
  private int tagPrice;

  @Column(name = "retail_price", precision = 10, scale = 0, nullable = false)
  private int retailPrice;

  @Column(name = "total", precision = 10, scale = 0, nullable = false)
  private int total;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ts", columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP()", nullable = false)
  private Date ts;

  @ManyToOne(cascade = { CascadeType.MERGE,
      CascadeType.REFRESH }, fetch = FetchType.EAGER, optional = false)
  @JoinColumn(name = "order_no", insertable = false, updatable = false)
  private OscOrderEntity orderEntity;

  @OneToOne
  @JoinColumn(name = "sku", referencedColumnName = "sku", insertable = false, updatable = false)
  private PscSkuEntity skuEntity;

  public final String getId() {
    return id;
  }

  public final void setId(String id) {
    this.id = id;
  }

  public final String getOrderNo() {
    return orderNo;
  }

  public final void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public final String getSku() {
    return sku;
  }

  public final void setSku(String sku) {
    this.sku = sku;
  }

  public final int getNum() {
    return num;
  }

  public final void setNum(int num) {
    this.num = num;
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

  public final int getTotal() {
    return total;
  }

  public final void setTotal(int total) {
    this.total = total;
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

  public final OscOrderEntity getOrderEntity() {
    return orderEntity;
  }

  public final void setOrderEntity(OscOrderEntity orderEntity) {
    this.orderEntity = orderEntity;
  }

  public final PscSkuEntity getSkuEntity() {
    return skuEntity;
  }

  public final void setSkuEntity(PscSkuEntity skuEntity) {
    this.skuEntity = skuEntity;
  }

}
