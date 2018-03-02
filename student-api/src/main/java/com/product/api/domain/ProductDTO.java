package com.product.api.domain;

import java.io.Serializable;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String proId;
	
	private String proName;
	
	private String proType;
	
	private Integer proPrice;
	
	private Integer proNum;
	
	private Integer proVolumn;
	
	private String proIntro;
	
	private String proImgsrc;
	
	private String proTdc;

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public Integer getProPrice() {
		return proPrice;
	}

	public void setProPrice(Integer proPrice) {
		this.proPrice = proPrice;
	}

	public Integer getProNum() {
		return proNum;
	}

	public void setProNum(Integer proNum) {
		this.proNum = proNum;
	}

	public Integer getProVolumn() {
		return proVolumn;
	}

	public void setProVolumn(Integer proVolumn) {
		this.proVolumn = proVolumn;
	}

	public String getProIntro() {
		return proIntro;
	}

	public void setProIntro(String proIntro) {
		this.proIntro = proIntro;
	}

	public String getProImgsrc() {
		return proImgsrc;
	}

	public void setProImgsrc(String proImgsrc) {
		this.proImgsrc = proImgsrc;
	}

	public String getProTdc() {
		return proTdc;
	}

	public void setProTdc(String proTdc) {
		this.proTdc = proTdc;
	}

	@Override
	public String toString() {
		
		return "a"+proName+"'s price is"+proPrice+"yuan, there have "+proNum+"stock!";
	}
	
	
}
