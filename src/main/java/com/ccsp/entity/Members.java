package com.ccsp.entity;
// default package
// Generated 14 Mar, 2017 5:57:31 PM by Hibernate Tools 5.0.2.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Members generated by hbm2java
 */
@Entity
@Table(name = "members")
public class Members implements java.io.Serializable {


  private long memberId;
  private String memberName;

  public Members() {}


  public Members(long id) {
    this.memberId = id;
  }

  public Members(long id, String memberName) {
    this.memberId = id;
    this.memberName = memberName;
  }

  @Id


  @Column(name = "id", unique = true, nullable = false)
  public long getMemberId() {
    return this.memberId;
  }

  public void setMemberId(long id) {
    this.memberId = id;
  }


  @Column(name = "member_name", length = 100)
  public String getMemberName() {
    return this.memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }



}


