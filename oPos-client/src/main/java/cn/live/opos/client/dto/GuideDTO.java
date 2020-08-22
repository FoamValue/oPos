package cn.live.opos.client.dto;

import java.io.Serializable;

/**
 * Guide dto.
 * 
 * @author chenxinjie
 * @date 2020-08-22
 */
public class GuideDTO implements Serializable {
  private static final long serialVersionUID = -4167678539483137457L;

  private String no;
  private String name;

  public GuideDTO() {

  }

  public GuideDTO(String no, String name) {
    this.no = no;
    this.name = name;
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

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

}
