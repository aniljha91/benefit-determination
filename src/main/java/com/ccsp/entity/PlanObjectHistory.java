package com.ccsp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlanObjectHistory generated by hbm2java
 */
@Entity
@Table(name = "PlanObjectHistory")
public class PlanObjectHistory implements java.io.Serializable {


  private int qhpplanObjectId;
  private String qhpplanObjectName;
  private String qhpplanDetails;
  private Date qhpplanObjectStartDate;
  private Date qhpplanObjectEndDate;

  public PlanObjectHistory() {}


  public PlanObjectHistory(int qhpplanObjectId, String qhpplanObjectName,
      Date qhpplanObjectStartDate) {
    this.qhpplanObjectId = qhpplanObjectId;
    this.qhpplanObjectName = qhpplanObjectName;
    this.qhpplanObjectStartDate = qhpplanObjectStartDate;
  }

  public PlanObjectHistory(int qhpplanObjectId, String qhpplanObjectName,
      String qhpplanDetails, Date qhpplanObjectStartDate, Date qhpplanObjectEndDate) {
    this.qhpplanObjectId = qhpplanObjectId;
    this.qhpplanObjectName = qhpplanObjectName;
    this.qhpplanDetails = qhpplanDetails;
    this.qhpplanObjectStartDate = qhpplanObjectStartDate;
    this.qhpplanObjectEndDate = qhpplanObjectEndDate;
  }

  @Id


  @Column(name = "QHPPlanObjectId", unique = true, nullable = false)
  public int getQhpplanObjectId() {
    return this.qhpplanObjectId;
  }

  public void setQhpplanObjectId(int qhpplanObjectId) {
    this.qhpplanObjectId = qhpplanObjectId;
  }


  @Column(name = "QHPPlanObjectName", nullable = false)
  public String getQhpplanObjectName() {
    return this.qhpplanObjectName;
  }

  public void setQhpplanObjectName(String qhpplanObjectName) {
    this.qhpplanObjectName = qhpplanObjectName;
  }


  @Column(name = "QHPPlanDetails")
  public String getQhpplanDetails() {
    return this.qhpplanDetails;
  }

  public void setQhpplanDetails(String qhpplanDetails) {
    this.qhpplanDetails = qhpplanDetails;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "QHPPlanObjectStartDate", nullable = false)
  public Date getQhpplanObjectStartDate() {
    return this.qhpplanObjectStartDate;
  }

  public void setQhpplanObjectStartDate(Date qhpplanObjectStartDate) {
    this.qhpplanObjectStartDate = qhpplanObjectStartDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "QHPPlanObjectEndDate")
  public Date getQhpplanObjectEndDate() {
    return this.qhpplanObjectEndDate;
  }

  public void setQhpplanObjectEndDate(Date qhpplanObjectEndDate) {
    this.qhpplanObjectEndDate = qhpplanObjectEndDate;
  }



}

