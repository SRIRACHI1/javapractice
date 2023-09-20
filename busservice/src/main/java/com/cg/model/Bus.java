package com.cg.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus_tbl")
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "busId")
	private int busId;
	@Column(name = "bookingType")
	private String bookingType;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "bookingPrice")
	private double bookingPrice;
//	@Column(name = "bookingDate")
//	private Date bookingDate;
	
	public Bus(int busId, String bookingType, String source, String destination, double bookingPrice) {
	super();
	this.busId = busId;
	this.bookingType = bookingType;
	this.source = source;
	this.destination = destination;
	this.bookingPrice = bookingPrice;
}
	
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBusId() {
		return busId;
	}

    public void setBusId(int busId) {
		this.busId = busId;
	}

    public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getBookingPrice() {
		return bookingPrice;
	}
	public void setBookingPrice(double bookingPrice) {
		this.bookingPrice = bookingPrice;
	}
//	public Date getBookingDate() {
//		return bookingDate;
//	}
//	public void setBookingDate(Date bookingDate) {
//		this.bookingDate = bookingDate;
//	}

}
	