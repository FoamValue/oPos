package cn.live.opos.center.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "osc_order_item", uniqueConstraints = {
    @UniqueConstraint(columnNames = { "order_no", "sku" }) })
public class OscOrderItemEntity implements Serializable {

  private static final long serialVersionUID = -7331381906879927968L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "jpa-uuid")
  @GenericGenerator(name = "jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "id", length = 36)
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

  @LastModifiedDate
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ts", columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP()", nullable = false)
  private Date ts;

  @ManyToOne(targetEntity = OscOrderEntity.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "order_no", referencedColumnName = "order_no", insertable = false, updatable = false)
  private OscOrderEntity orderEntity;

  @ManyToOne(targetEntity = PscSkuEntity.class, cascade = CascadeType.REFRESH)
  @JoinColumn(name = "sku", referencedColumnName = "sku", insertable = false, updatable = false)
  private PscSkuEntity skuEntity;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
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

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
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

  public OscOrderEntity getOrderEntity() {
    return orderEntity;
  }

  public void setOrderEntity(OscOrderEntity orderEntity) {
    this.orderEntity = orderEntity;
  }

  public PscSkuEntity getSkuEntity() {
    return skuEntity;
  }

  public void setSkuEntity(PscSkuEntity skuEntity) {
    this.skuEntity = skuEntity;
  }

}
