package com.study.hotel.Service;

import java.util.List;

import com.study.hotel.Dto.HotelDto;
import com.study.hotel.entity.Hotel;

public interface HotelService {
	
	Hotel saveHotel (HotelDto hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotelById(Long id);

	Hotel getHotelByRatingId(Long ratingId);
	

}
