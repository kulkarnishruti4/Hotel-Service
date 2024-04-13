package com.study.hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Hotel")
@Data
public class Hotel {
	
	public static final Long serialUID = 1L;

	@Id
	@Column(name = "HOTEL_ID")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long hotelId;
	
	@Column(name = "HOTEL_NAME")
	private String hotelName;
	
	@Column(name = "LOCATION")
	private String location;
	
	@Column(name = "ABOUT")
	private String about;
	
	@Column(name = "RATING_ID")
	private Long ratingId;
	
	public Hotel() {
		
	}
	
	public Hotel (String hotelName, String location, String about, Long ratingId) {
		this.about = about;
		this.hotelName = hotelName;
		this.location = location;
		this.ratingId = ratingId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}
	
	
}
