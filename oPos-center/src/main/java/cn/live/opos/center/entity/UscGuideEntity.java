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

/**
 * usc_guide.
 * 
 * @author chenxinjie
 * @date 2020-08-01
 */
@Entity
@Table(name = "usc_guide", uniqueConstraints = { @UniqueConstraint(columnNames = "no") })
public class UscGuideEntity implements Serializable {

  private static final long serialVersionUID = -5648617800765002770L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "jpa-uuid")
  @GenericGenerator(name = "jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "id", length = 36)
  private String id;

  @Column(name = "no", length = 20, nullable = false)
  private String no;

  @Column(name = "name", length = 40, nullable = false)
  private String name;

  @Column(name = "gender", columnDefinition = "int default 0", nullable = false)
  private int gender;

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

  public String getNo() {
    return no;
  }

  public void setNo(String no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public Date getTs() {
    return ts;
  }

  public void setTs(Date ts) {
    this.ts = ts;
  }

  public static final long getSerialversionuid() {
    return serialVersionUID;
  }

}
