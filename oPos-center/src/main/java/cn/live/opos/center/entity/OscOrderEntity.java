package cn.live.opos.center.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "osc_order", uniqueConstraints = { @UniqueConstraint(columnNames = "order_no") })
public class OscOrderEntity implements Serializable {

  private static final long serialVersionUID = -4409502876337140593L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "jpa-uuid")
  @GenericGenerator(name = "jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "id", length = 36)
  private String id;

  @Column(name = "order_no", length = 40, nullable = false)
  private String orderNo;

  @CreatedDate
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Temporal(TemporalType.DATE)
  @Column(name = "order_date", nullable = false)
  private Date orderDate;

  /**
   * 1: sell of goods. 2: return of goods.
   */
  @Column(name = "order_type", nullable = false)
  private int orderType;

  @Column(name = "order_status", nullable = false)
  private int orderStatus;

  @Column(name = "num", precision = 5, scale = 0, nullable = false)
  private int num;

  @Column(name = "total", precision = 10, scale = 0, nullable = false)
  private int total;

  @Column(name = "guide_no", length = 20, nullable = false)
  private String guideNo;

  @LastModifiedDate
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ts", columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP()", nullable = false)
  private Date ts;

  @OneToMany(targetEntity = OscOrderItemEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "order_no", referencedColumnName = "order_no", insertable = false, updatable = false)
  private List<OscOrderItemEntity> orderItems;

  @ManyToOne(targetEntity = UscGuideEntity.class, cascade = CascadeType.REFRESH)
  @JoinColumn(name = "guide_no", referencedColumnName = "no", insertable = false, updatable = false)
  private UscGuideEntity guideEntity;

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

  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public int getOrderType() {
    return orderType;
  }

  public void setOrderType(int orderType) {
    this.orderType = orderType;
  }

  public int getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(int orderStatus) {
    this.orderStatus = orderStatus;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
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

  public List<OscOrderItemEntity> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OscOrderItemEntity> orderItems) {
    this.orderItems = orderItems;
  }

  public String getGuideNo() {
    return guideNo;
  }

  public void setGuideNo(String guideNo) {
    this.guideNo = guideNo;
  }

  public UscGuideEntity getGuideEntity() {
    return guideEntity;
  }

  public void setGuideEntity(UscGuideEntity guideEntity) {
    this.guideEntity = guideEntity;
  }

}
