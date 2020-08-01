package cn.live.opos.center.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "osc_order", uniqueConstraints = { @UniqueConstraint(columnNames = "order_no") })
public class OscOrderEntity implements Serializable {

  private static final long serialVersionUID = -4409502876337140593L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id", length = 32)
  private String id;

  @Column(name = "order_no", length = 40, nullable = false)
  private String orderNo;

  @JsonFormat(pattern = "yyyy-MM-dd")
  @Temporal(TemporalType.DATE)
  @Column(name = "order_date", nullable = false)
  private Date orderDate;

  @Column(name = "order_type", nullable = false)
  private Date orderType;

  @Column(name = "order_status", nullable = false)
  private Date orderStatus;

  @Column(name = "num", precision = 5, scale = 0, nullable = false)
  private int num;

  @Column(name = "total", precision = 10, scale = 0, nullable = false)
  private int total;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ts", columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP()", nullable = false)
  private Date ts;

  @OneToMany(cascade = { CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE,
      CascadeType.REMOVE }, fetch = FetchType.LAZY, mappedBy = "orderEntity")
  private Set<OscOrderItemEntity> orderItems;

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

  public final Date getOrderDate() {
    return orderDate;
  }

  public final void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public final Date getOrderType() {
    return orderType;
  }

  public final void setOrderType(Date orderType) {
    this.orderType = orderType;
  }

  public final Date getOrderStatus() {
    return orderStatus;
  }

  public final void setOrderStatus(Date orderStatus) {
    this.orderStatus = orderStatus;
  }

  public final int getNum() {
    return num;
  }

  public final void setNum(int num) {
    this.num = num;
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

  public final Set<OscOrderItemEntity> getOrderItems() {
    return orderItems;
  }

  public final void setOrderItems(Set<OscOrderItemEntity> orderItems) {
    this.orderItems = orderItems;
  }

}
