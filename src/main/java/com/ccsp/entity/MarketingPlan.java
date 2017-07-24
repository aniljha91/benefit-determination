package com.ccsp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarketingPlan generated by hbm2java
 */
@Entity
@Table(name = "MarketingPlan", uniqueConstraints = { @UniqueConstraint(columnNames = "MktPlanId"),
		@UniqueConstraint(columnNames = "AdminPlanId") })
public class MarketingPlan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3364083847107755460L;
	@Id
	@Column(name = "NodeId", columnDefinition = "BINARY(254)", length = 254, unique = true, nullable = false)
	private byte[] nodeId;
	private Short nodeLevel;
	private int mktPlanId;
	private Integer adminPlanId;
	private String MktPlanName;
	private String mktPlanCoverage;
	private Date mktPlanEffectiveDate;
	private Date mktPlanExpirationDate;
	private String mktPlanType;
	private String mktPlanLevelOfCoverage;
	private String mktPlanNetworkName;
	private String mktPlanFormulary;
	private String mktPlanCurrentOrProposed;
	private String mktPlanStateName;
	private String mktPlanHsaeligible;

	public MarketingPlan() {
	}

	public MarketingPlan(byte[] nodeId, int mktPlanId, String MktPlanName, String mktPlanCoverage,
			Date mktPlanEffectiveDate, Date mktPlanExpirationDate, String mktPlanType, String mktPlanLevelOfCoverage,
			String mktPlanNetworkName, String mktPlanFormulary, String mktPlanCurrentOrProposed,
			String mktPlanStateName, String mktPlanHsaeligible) {
		this.nodeId = nodeId;
		this.mktPlanId = mktPlanId;
		this.MktPlanName = MktPlanName;
		this.mktPlanCoverage = mktPlanCoverage;
		this.mktPlanEffectiveDate = mktPlanEffectiveDate;
		this.mktPlanExpirationDate = mktPlanExpirationDate;
		this.mktPlanType = mktPlanType;
		this.mktPlanLevelOfCoverage = mktPlanLevelOfCoverage;
		this.mktPlanNetworkName = mktPlanNetworkName;
		this.mktPlanFormulary = mktPlanFormulary;
		this.mktPlanCurrentOrProposed = mktPlanCurrentOrProposed;
		this.mktPlanStateName = mktPlanStateName;
		this.mktPlanHsaeligible = mktPlanHsaeligible;
	}

	public MarketingPlan(byte[] nodeId, Short nodeLevel, int mktPlanId, Integer adminPlanId, String MktPlanName,
			String mktPlanCoverage, Date mktPlanEffectiveDate, Date mktPlanExpirationDate, String mktPlanType,
			String mktPlanLevelOfCoverage, String mktPlanNetworkName, String mktPlanFormulary,
			String mktPlanCurrentOrProposed, String mktPlanStateName, String mktPlanHsaeligible) {
		this.nodeId = nodeId;
		this.nodeLevel = nodeLevel;
		this.mktPlanId = mktPlanId;
		this.adminPlanId = adminPlanId;
		this.MktPlanName = MktPlanName;
		this.mktPlanCoverage = mktPlanCoverage;
		this.mktPlanEffectiveDate = mktPlanEffectiveDate;
		this.mktPlanExpirationDate = mktPlanExpirationDate;
		this.mktPlanType = mktPlanType;
		this.mktPlanLevelOfCoverage = mktPlanLevelOfCoverage;
		this.mktPlanNetworkName = mktPlanNetworkName;
		this.mktPlanFormulary = mktPlanFormulary;
		this.mktPlanCurrentOrProposed = mktPlanCurrentOrProposed;
		this.mktPlanStateName = mktPlanStateName;
		this.mktPlanHsaeligible = mktPlanHsaeligible;
	}
	public byte[] getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(byte[] nodeId) {
		this.nodeId = nodeId;
	}

	@Column(name = "NodeLevel")
	public Short getNodeLevel() {
		return this.nodeLevel;
	}

	public void setNodeLevel(Short nodeLevel) {
		this.nodeLevel = nodeLevel;
	}

	@Column(name = "MktPlanId", unique = true, nullable = false)
	public int getMktPlanId() {
		return this.mktPlanId;
	}

	public void setMktPlanId(int mktPlanId) {
		this.mktPlanId = mktPlanId;
	}
	
	@Column(name = "AdminPlanId", unique = true)
	public Integer getAdminPlanId() {
		return this.adminPlanId;
	}

	public void setAdminPlanId(Integer adminPlanId) {
		this.adminPlanId = adminPlanId;
	}

	@Column(name = "MktPlanName", nullable = false)
	public String getMktPlanName() {
		return this.MktPlanName;
	}

	public void setMktPlanName(String MktPlanName) {
		this.MktPlanName = MktPlanName;
	}

	
	@Column(name = "MktPlanCoverage", nullable = false)
	public String getMktPlanCoverage() {
		return this.mktPlanCoverage;
	}

	public void setMktPlanCoverage(String mktPlanCoverage) {
		this.mktPlanCoverage = mktPlanCoverage;
	}

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MktPlanEffectiveDate", nullable = false)
	public Date getMktPlanEffectiveDate() {
		return this.mktPlanEffectiveDate;
	}

	public void setMktPlanEffectiveDate(Date mktPlanEffectiveDate) {
		this.mktPlanEffectiveDate = mktPlanEffectiveDate;
	}

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MktPlanExpirationDate", nullable = false)
	public Date getMktPlanExpirationDate() {
		return this.mktPlanExpirationDate;
	}

	public void setMktPlanExpirationDate(Date mktPlanExpirationDate) {
		this.mktPlanExpirationDate = mktPlanExpirationDate;
	}

	
	@Column(name = "MktPlanType", nullable = false)
	public String getMktPlanType() {
		return this.mktPlanType;
	}

	public void setMktPlanType(String mktPlanType) {
		this.mktPlanType = mktPlanType;
	}
	
	@Column(name = "MktPlanLevelOfCoverage", nullable = false)
	public String getMktPlanLevelOfCoverage() {
		return this.mktPlanLevelOfCoverage;
	}

	public void setMktPlanLevelOfCoverage(String mktPlanLevelOfCoverage) {
		this.mktPlanLevelOfCoverage = mktPlanLevelOfCoverage;
	}
	
	@Column(name = "MktPlanNetworkName", nullable = false)
	public String getMktPlanNetworkName() {
		return this.mktPlanNetworkName;
	}

	public void setMktPlanNetworkName(String mktPlanNetworkName) {
		this.mktPlanNetworkName = mktPlanNetworkName;
	}

	@Column(name = "MktPlanFormulary", nullable = false)
	public String getMktPlanFormulary() {
		return this.mktPlanFormulary;
	}

	public void setMktPlanFormulary(String mktPlanFormulary) {
		this.mktPlanFormulary = mktPlanFormulary;
	}

	@Column(name = "MktPlanCurrentOrProposed", nullable = false)
	public String getMktPlanCurrentOrProposed() {
		return this.mktPlanCurrentOrProposed;
	}

	public void setMktPlanCurrentOrProposed(String mktPlanCurrentOrProposed) {
		this.mktPlanCurrentOrProposed = mktPlanCurrentOrProposed;
	}
	
	@Column(name = "MktPlanStateName", nullable = false)
	public String getMktPlanStateName() {
		return this.mktPlanStateName;
	}

	public void setMktPlanStateName(String mktPlanStateName) {
		this.mktPlanStateName = mktPlanStateName;
	}

	@Column(name = "MktPlanHSAEligible", nullable = false)
	public String getMktPlanHsaeligible() {
		return this.mktPlanHsaeligible;
	}

	public void setMktPlanHsaeligible(String mktPlanHsaeligible) {
		this.mktPlanHsaeligible = mktPlanHsaeligible;
	}

}
