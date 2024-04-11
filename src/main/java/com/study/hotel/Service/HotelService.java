package com.study.hotel.Service;

import java.util.List;

import com.study.hotel.entity.Hotel;

public interface HotelService {
	
	Hotel saveHotel (Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotelById(String id);
	

}
