package com.ccsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GrandfatheredList generated by hbm2java
 */
@Entity
@Table(name = "GrandfatheredList")
public class GrandfatheredList implements java.io.Serializable {


  private int grandatheredId;
  private boolean grandFatheredValue;

  public GrandfatheredList() {}

  public GrandfatheredList(int grandatheredId, boolean grandFatheredValue) {
    this.grandatheredId = grandatheredId;
    this.grandFatheredValue = grandFatheredValue;
  }

  @Id


  @Column(name = "GrandatheredId", unique = true, nullable = false)
  public int getGrandatheredId() {
    return this.grandatheredId;
  }

  public void setGrandatheredId(int grandatheredId) {
    this.grandatheredId = grandatheredId;
  }


  @Column(name = "GrandFatheredValue", nullable = false)
  public boolean isGrandFatheredValue() {
    return this.grandFatheredValue;
  }

  public void setGrandFatheredValue(boolean grandFatheredValue) {
    this.grandFatheredValue = grandFatheredValue;
  }



}


