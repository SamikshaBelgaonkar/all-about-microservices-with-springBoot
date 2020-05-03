package org.survey.techno.covid_19.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Survey")
@ApiModel(description = "All details about the survey ")
public class Survey {
	@Id
	private long id;
	@Size(min = 1)
	@ApiModelProperty(notes = "Should have atleast 2 characters")
	private String state;
	@Size(min = 1, message = "should have atleast 2 characters")
	@ApiModelProperty(notes = "Should have atleast 2 characters")
	private String country;

	private int positiveCasesReported;
	private int casesUnderObservation;
	private String from;
	private String to;
	private BigDecimal priceToBeDonated;
	private BigDecimal conversionMultiple;
	private BigDecimal totalCalculatedAmount;
	private int port;

	public Survey() {
	}

	public Survey(long id, String from, String to, BigDecimal priceToBeDonated, BigDecimal conversionMultiple,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.priceToBeDonated = priceToBeDonated;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public Survey(long id, @Size(min = 1) String state,
			@Size(min = 1, message = "should have atleast 2 characters") String country, int positiveCasesReported,
			int casesUnderObservation) {
		super();
		this.id = id;
		this.state = state;
		this.country = country;
		this.positiveCasesReported = positiveCasesReported;
		this.casesUnderObservation = casesUnderObservation;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getPriceToBeDonated() {
		return priceToBeDonated;
	}

	public void setPriceToBeDonated(BigDecimal priceToBeDonated) {
		this.priceToBeDonated = priceToBeDonated;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPositiveCasesReported() {
		return positiveCasesReported;
	}

	public void setPositiveCasesReported(int positiveCasesReported) {
		this.positiveCasesReported = positiveCasesReported;
	}

	public int getCasesUnderObservation() {
		return casesUnderObservation;
	}

	public void setCasesUnderObservation(int casesUnderObservation) {
		this.casesUnderObservation = casesUnderObservation;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", state=" + state + ", country=" + country + ", positiveCasesReported="
				+ positiveCasesReported + ", casesUnderObservation=" + casesUnderObservation + "]";
	}

}
