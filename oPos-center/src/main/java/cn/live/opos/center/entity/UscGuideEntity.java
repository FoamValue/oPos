package cn.live.opos.center.entity;

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
public class UscGuideEntity {

  private static final long serialVersionUID = -5648617800765002770L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id", length = 32)
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

  public final String getId() {
    return id;
  }

  public final void setId(String id) {
    this.id = id;
  }

  public final String getNo() {
    return no;
  }

  public final void setNo(String no) {
    this.no = no;
  }

  public final String getName() {
    return name;
  }

  public final void setName(String name) {
    this.name = name;
  }

  public final int getGender() {
    return gender;
  }

  public final void setGender(int gender) {
    this.gender = gender;
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
