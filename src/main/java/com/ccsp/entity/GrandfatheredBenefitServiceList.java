package com.ccsp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GrandfatheredBenefitServiceList generated by hbm2java
 */
@Entity
@Table(name = "GrandfatheredBenefitServiceList")
public class GrandfatheredBenefitServiceList implements java.io.Serializable {


  private int grandfatheredBenefitServiceId;
  private int corporateBenefitServiceId;
  private int grandfatheredId;
  private String grandfatheredBenefitServiceCode;
  private String grandfatheredBenefitServiceName;
  private String grandfatheredBenefitServiceDescription;

  public GrandfatheredBenefitServiceList() {}

  public GrandfatheredBenefitServiceList(int grandfatheredBenefitServiceId,
      int corporateBenefitServiceId, int grandfatheredId, String grandfatheredBenefitServiceCode,
      String grandfatheredBenefitServiceName, String grandfatheredBenefitServiceDescription) {
    this.grandfatheredBenefitServiceId = grandfatheredBenefitServiceId;
    this.corporateBenefitServiceId = corporateBenefitServiceId;
    this.grandfatheredId = grandfatheredId;
    this.grandfatheredBenefitServiceCode = grandfatheredBenefitServiceCode;
    this.grandfatheredBenefitServiceName = grandfatheredBenefitServiceName;
    this.grandfatheredBenefitServiceDescription = grandfatheredBenefitServiceDescription;
  }

  @Id


  @Column(name = "GrandfatheredBenefitServiceID", unique = true, nullable = false)
  public int getGrandfatheredBenefitServiceId() {
    return this.grandfatheredBenefitServiceId;
  }

  public void setGrandfatheredBenefitServiceId(int grandfatheredBenefitServiceId) {
    this.grandfatheredBenefitServiceId = grandfatheredBenefitServiceId;
  }


  @Column(name = "CorporateBenefitServiceID", nullable = false)
  public int getCorporateBenefitServiceId() {
    return this.corporateBenefitServiceId;
  }

  public void setCorporateBenefitServiceId(int corporateBenefitServiceId) {
    this.corporateBenefitServiceId = corporateBenefitServiceId;
  }


  @Column(name = "GrandfatheredId", nullable = false)
  public int getGrandfatheredId() {
    return this.grandfatheredId;
  }

  public void setGrandfatheredId(int grandfatheredId) {
    this.grandfatheredId = grandfatheredId;
  }


  @Column(name = "GrandfatheredBenefitServiceCode", nullable = false)
  public String getGrandfatheredBenefitServiceCode() {
    return this.grandfatheredBenefitServiceCode;
  }

  public void setGrandfatheredBenefitServiceCode(String grandfatheredBenefitServiceCode) {
    this.grandfatheredBenefitServiceCode = grandfatheredBenefitServiceCode;
  }


  @Column(name = "GrandfatheredBenefitServiceName", nullable = false)
  public String getGrandfatheredBenefitServiceName() {
    return this.grandfatheredBenefitServiceName;
  }

  public void setGrandfatheredBenefitServiceName(String grandfatheredBenefitServiceName) {
    this.grandfatheredBenefitServiceName = grandfatheredBenefitServiceName;
  }


  @Column(name = "GrandfatheredBenefitServiceDescription", nullable = false)
  public String getGrandfatheredBenefitServiceDescription() {
    return this.grandfatheredBenefitServiceDescription;
  }

  public void setGrandfatheredBenefitServiceDescription(
      String grandfatheredBenefitServiceDescription) {
    this.grandfatheredBenefitServiceDescription = grandfatheredBenefitServiceDescription;
  }



}


