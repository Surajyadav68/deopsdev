package com.suninfotech.admin.dto;

public class Page {
	private int totalPages;
	private int numberOfElements;
	private long totalElements;
	private int docketCounts;
	private double docketWeight;
	private double docketVolWeight;

	public Page(int totalPages, int numberOfElements, long totalElements,int docketCounts,double docketWeight, double docketVolWeight) {
		this.totalPages = totalPages;
		this.numberOfElements = numberOfElements;
		this.totalElements = totalElements;
		this.docketCounts=docketCounts;
		this.docketWeight=docketWeight;
		this.docketVolWeight=docketVolWeight;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	public int getDocketCounts() {
		return docketCounts;
	}

	public void setDocketCounts(int docketCounts) {
		this.docketCounts = docketCounts;
	}

	public double getDocketWeight() {
		return docketWeight;
	}

	public void setDocketWeight(double docketWeight) {
		this.docketWeight = docketWeight;
	}

	public double getDocketVolWeight() {
		return docketVolWeight;
	}

	public void setDocketVolWeight(double docketVolWeight) {
		this.docketVolWeight = docketVolWeight;
	}
	
}